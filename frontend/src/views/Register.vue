<template>
  <main class="text-center py-5 m-auto w-25" style="display: block">
    <form>
      <h1 class="h3 mb-4 fw-lighter">Registration form</h1>

      <!-- EMAIL -->
      <div title="Your email address" class="form-floating mb-2">
        <input type="email" class="form-control" id="emailInput" placeholder="your_email@example.com" required>
        <label for="emailInput">Email address</label>
      </div>

      <!-- PHONE NUMBER -->
      <div title="Your phone is proof that you are a real person" class="form-floating mb-2">
        <input type="tel" class="form-control" id="phoneNumber" placeholder="+0 (000) 000-00-00" required>
        <label for="phoneNumber">Phone number</label>
      </div>

      <!-- PASSWORD -->
      <div class="form-floating mb-2">
        <input type="password" class="form-control" id="passwordInput" placeholder="your_password" required>
        <label for="passwordInput">Password</label>
      </div>

      <!-- PASSWORD CONFIRM -->
      <div class="form-floating mb-3">
        <input type="password" class="form-control" id="passwordConfirmInput" placeholder="your_password" required>
        <label for="passwordConfirmInput">Password confirm</label>
      </div>

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
export default {
  name: "Register"
}
</script>