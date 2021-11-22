<template>
  <div class="border rounded m-3 p-1 text-center" style="width: 250px">
    <p>{{ category.name }}</p>
    <div>
      <div v-for="task in category.tasks">
        <Task :task="task"></Task>
      </div>
    </div>
  </div>
</template>

<script>
import Task from "@/components/Board/Task";
export default {
  name: "Category",
  components: {Task},
  props: ['category']
}
</script>