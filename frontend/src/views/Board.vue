<template>
  <div class="d-flex">
    <div v-for="category in categories">
      <Category :category="category"></Category>
    </div>
  </div>
</template>

<script>
import Category from "@/components/Board/Category";
export default {
  name: "Board",
  components: {Category},
  data() {
    return {
      categories: [
        {
          name: "Develop",
          tasks: [
            {
              name: "Initialize",
              description: "Made initialize version.",
              expanded: false
            },
            {
              name: "Vue integrity",
              description: "Integrates vue framework.",
              expanded: false
            },
            {
              name: "Docker integrity",
              description: "This task creates for test very long description.",
              expanded: false
            }
          ]
        },
        {
          name: "Release",
          tasks: [
            {
              name: "Build",
              description: "Build release version.",
              expanded: false
            }
          ]
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>