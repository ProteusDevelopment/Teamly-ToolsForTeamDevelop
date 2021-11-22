<template>
  <div id="app">
    <div class="container-fluid">
      <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
        <!-- TITLE HEADER -->
        <div class="col-12 col-md-auto mb-2 justify-content-center mb-md-0">
          <router-link :to="{name: 'Home'}" class="px-2 fs-3 text-decoration-none">Teamly</router-link>
        </div>

        <!-- AUTH BLOCK -->
        <div class="col-md-3 text-center" v-if="!['Register'].includes(this.$route.name)">
          <button type="button" class="btn btn-outline-primary me-2" onclick="toggleLoginBlock()">{{ this.$tr('Login') }}</button>
          <router-link :to="{name: 'Register'}" class="btn btn-primary">{{ this.$tr('Register') }}</router-link>

          <!-- LOGIN BLOCK -->
          <div class="login position-absolute bg-light rounded-3 border text-center p-3 m-2">
            <form>
              <h1 class="h4 mb-3 fw-normal">{{ this.$tr('Please login') }}</h1>

              <!-- EMAIL -->
              <div class="form-floating mb-1">
                <input type="email" class="form-control" id="emailInput" placeholder="name@example.com" required>
                <label for="emailInput">Email address</label>
              </div>

              <!-- PASSWORD -->
              <div class="form-floating mb-1">
                <input type="password" class="form-control" id="passwordInput" placeholder="Password" required>
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
