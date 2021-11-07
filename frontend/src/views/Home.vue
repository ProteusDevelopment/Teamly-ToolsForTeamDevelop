<template>
	<!-- MAIN -->
	<main class="d-flex flex-row justify-content-between">
		<!-- MAIN BLOCK -->
		<div class="mx-5">
			<!-- TASK BOARD FEATURE -->
      <RightImageFeature :feature="features[0]"></RightImageFeature>

			<!-- BUG TRACKER FEATURE -->
      <LeftImageFeature :feature="features[1]" class="my-3"></LeftImageFeature>

			<!-- GIT FEATURE -->
      <RightImageFeature :feature="features[2]" class="my-3"></RightImageFeature>
		</div>
	</main>
</template>

<script>
// @ is an alias to /src
import LeftImageFeature from "@/components/Features/LeftImageFeature";
import RightImageFeature from "@/components/Features/RightImageFeature";

export default {
  name: 'Home',
  components: {
    RightImageFeature,
    LeftImageFeature
  },
  data() {
    return {
      features: [
        {
          img: {
            src: "images/board.png",
            alt: "Task board screenshot"
          },
          text: {
            header: "Task board for your team",
            description: "A convenient task board will allow your team to deal exclusively with tasks, and we will take care of their organization!"
          },
          button: {
            link: {
              // name: 'Register'
              name: 'Board'
            },
            text: "Try it for free",
            class: "btn-primary"
          }
        },
        {
          img: {
            src: "images/bugtracker.png",
            alt: "Bug tracker screenshot"
          },
          text: {
            header: "Bug tracker for your developers and testers",
            description: "Develop, test, fix, test again, and finally: shut down - that's the best part!"
          },
          button: {
            link: {
              name: 'Register'
            },
            text: "It's free too!",
            class: "btn-success"
          }
        },
        {
          img: {
            src: "images/git.png",
            alt: "Git support screenshot"
          },
          text: {
            header: "Git support",
            description: "Version control (Git) support is available in the application for easy tracking of commits and changes in branches. All that remains for your team is to sip some tea."
          },
          button: {
            link: {
              name: 'Downloads'
            },
            text: "Available in the app",
            class: "btn-warning"
          }
        }
      ]
    }
  }
}

</script>
