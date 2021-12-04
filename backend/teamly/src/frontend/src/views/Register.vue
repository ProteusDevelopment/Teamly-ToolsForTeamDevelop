<template>
  <main class="text-center py-5 m-auto w-25" style="display: block">
    <form @submit.prevent="onSubmit">
      <h1 class="h3 mb-4 fw-lighter">Registration form</h1>

      <!-- Name -->
      <div title="Your username" class="form-floating mb-2">
        <input v-model="form.name" type="text" class="form-control" id="nameInput" placeholder="username" required>
        <label for="nameInput">Username</label>
      </div>

      <!-- Display name -->
      <div title="Name, which other users can see" class="form-floating mb-2">
        <input v-model="form.displayName" type="text" class="form-control" id="displayName" placeholder="username">
        <label for="displayName">Display name</label>
      </div>

      <!-- EMAIL -->
      <div title="Your email" class="form-floating mb-2">
        <input v-model="form.email" type="email" class="form-control" id="email" placeholder="example@teamply.com" required>
        <label for="email">Email</label>
      </div>

      <!-- PASSWORD -->
      <div class="form-floating mb-3">
        <input v-model="form.password" type="password" class="form-control" id="passwordInput" placeholder="your_password" required>
        <label for="passwordInput">Password</label>
      </div>

      <!-- PASSWORD CONFIRM -->
      <!--
      <div class="form-floating mb-3">
        <input type="password" class="form-control" id="passwordConfirmInput" placeholder="your_password" required>
        <label for="passwordConfirmInput">Password confirm</label>
      </div>
      -->

      <!-- LICENSE AGREEMENT -->
      <div class="form-check mt-3 mb-3">
        <label>
          <input type="checkbox" class="form-check-input" value="remember-me" required>
          I accept the terms of the
          <a href="license.html" class="link-primary" >license agreement</a>
        </label>
      </div>

      <button type="submit" class="btn btn-lg btn-primary mt-3 w-100">Register</button>
    </form>
  </main>
</template>

<script>
import axios from "axios"
import qs from "querystring"

export default {
  name: "Register",

  data() {
    return {
      form: {
        name: null,
        displayName: null,
        email: null,
        password: null
      }
    }
  },

  methods: {
    onSubmit() {
      this.$http.post(
        "/users/register",
        qs.stringify(this.form),
        {
          dataType: "x-www-form-urlencoded",
          headers: { 'content-type': 'application/x-www-form-urlencoded' }
      })
      .then(response => {
        if (response.data === "Success")
          this.$router.push({
            name: "Home"
          })
      })
      .catch(e => {

      })
    }
  }
}
</script>