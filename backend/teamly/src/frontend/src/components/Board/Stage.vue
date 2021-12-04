<template>
  <div class="border rounded m-3 p-1 text-center" style="width: 250px">
    <p>{{ stage.name }}</p>
    <div>
      <div v-for="task in stage.tasks">
        <Task :task="task"></Task>
      </div>
    </div>
  </div>
</template>

<script>
import Task from "@/components/Board/Task";
export default {
  name: "Stage",
  components: {Task},
  props: ['stage']
}
</script>