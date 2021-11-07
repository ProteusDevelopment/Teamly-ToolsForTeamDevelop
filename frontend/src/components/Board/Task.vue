<template>
  <div class="border rounded m-3 p-1 text-start" @click="expand(task)" style="cursor: pointer">
    <p>{{ task.name }}</p>
    <p v-if="task.expanded">{{ task.description }}</p>
  </div>
</template>

<script>
export default {
  name: "Task",
  props: ['task'],
  methods: {
    expand() {
      this.task.expanded = !this.task.expanded
    }
  }
}
</script>