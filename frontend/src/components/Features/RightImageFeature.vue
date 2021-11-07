<template>
  <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
    <!-- IMAGE -->
    <div class="col-10 col-sm-8 col-lg-6">
      <img :src="feature.img.src" class="d-block mx-lg-auto img-fluid border rounded-3 shadow-lg" :alt="feature.img.alt" loading="lazy">
    </div>

    <!-- TEXT -->
    <div class="col-lg-6">
      <!-- HEADER -->
      <h1 class="display-5 fw-bold lh-1 mb-3">{{ feature.text.header }}</h1>

      <!-- DESCRIPTION -->
      <p class="lead">{{ feature.text.description }}</p>

      <!-- BUTTON -->
      <div class="d-grid gap-1 d-md-flex justify-content-md-center">
        <router-link :to="feature.button.link" class="btn btn-lg px-4 me-md-2" :class="feature.button.class">
          {{ feature.button.text }}
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "RightImageFeature",
  props: ['feature']
}
</script>