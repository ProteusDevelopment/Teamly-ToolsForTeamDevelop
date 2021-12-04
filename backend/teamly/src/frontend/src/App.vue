<template>
  <div id="app">
    <div class="container-fluid">
      <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
        <!-- TITLE HEADER -->
        <div class="col-12 col-md-auto mb-2 justify-content-center mb-md-0">
          <router-link :to="{name: 'Home'}" class="px-2 fs-3 text-decoration-none">Teamly</router-link>
        </div>

        <!-- AUTH BLOCK -->
        <div class="col-md-3 text-center" v-if="!['Register'].includes(this.$route.name) && !this.isLogged">
          <button type="button" class="btn btn-outline-primary me-2" onclick="toggleLoginBlock()">{{ this.$tr('Login') }}</button>
          <router-link :to="{name: 'Register'}" class="btn btn-primary">{{ this.$tr('Register') }}</router-link>

          <!-- LOGIN BLOCK -->
          <div class="login position-absolute bg-light rounded-3 border text-center p-3 m-2">
            <form @submit.prevent="onSubmit">
              <h1 class="h4 mb-3 fw-normal">{{ this.$tr('Please login') }}</h1>

              <!-- NAME -->
              <div class="form-floating mb-1">
                <input v-model="form.name" type="text" class="form-control" id="nameInput" placeholder="username" required>
                <label for="nameInput">Username</label>
              </div>

              <!-- PASSWORD -->
              <div class="form-floating mb-1">
                <input v-model="form.password" type="password" class="form-control" id="passwordInput" placeholder="Password" required>
                <label for="passwordInput">Password</label>
              </div>

              <!-- REMEMBER ME -->
              <div class="form-check mb-3">
                <label>
                  <input type="checkbox" value="remember-me"> Remember me
                </label>
              </div>

              <button class="w-100 btn btn-lg btn-primary" type="submit">Login</button>
            </form>
          </div>
        </div>

        <div class="col-md-3 text-center" v-if="!['Register'].includes(this.$route.name) && this.isLogged">
          <button type="button" class="btn btn-outline-primary me-2" @click="logout">{{ this.$tr('Logout') }}</button>
        </div>
      </header>
    </div>

		<div>
			<router-view/>
		</div>

		<div class="container-fluid">
			<footer class="pt-3 mt-4">
				<p class="text-center text-muted border-top pt-3 mt-3">&copy; 2021 Artyom Chernykh</p>
			</footer>
		</div>
  </div>
</template>

<script>
import qs from "querystring"

export default {
  data() {
    return {
      form: {
        name: null,
        password: null
      },

      isLogged: false
    }
  },

  methods: {
    onSubmit() {
      this.$http.get("/users/login", {
        params: this.form
      })
      .then(response => {
        if (response.data === "Success") {
          this.isLogged = true
          this.$router.push({
            name: "Home"
          })
        }
      })
    },

    logout() {
      this.isLogged = false
    }
  }
}
</script>
