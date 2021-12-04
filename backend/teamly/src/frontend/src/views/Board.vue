<template>
  <div class="d-flex">
    <div v-for="stage in data.stages">
      <Stage :stage="stage"></Stage>
    </div>
  </div>
</template>

<script>
import Stage from "@/components/Board/Stage";
import axios from "axios"

export default {
  name: "Board",
  components: {Stage},
  data() {
    return {
      data: []
    }
  },

  created() {
    this.$http.get("/boards/1")
    .then(response => {
      this.data = response.data
    })
    .catch(e => {

    })
  }
}
</script>

<style scoped>

</style>