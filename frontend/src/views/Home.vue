<template>
	<!-- MAIN -->
	<main class="d-flex flex-row justify-content-between">
		<!-- MAIN BLOCK -->
		<div class="mx-5">
			<!-- TASK BOARD FEATURE -->
			<div class="row flex-lg-row-reverse align-items-center g-5 py-5">
				<div class="col-10 col-sm-8 col-lg-6">
					<img src="images/board.png" class="d-block mx-lg-auto img-fluid border rounded-3 shadow-lg" alt="Task board screenshot" loading="lazy">
				</div>
				<div class="col-lg-6">
					<h1 class="display-5 fw-bold lh-1 mb-3">Task board for your team</h1>
					<p class="lead">A convenient task board will allow your team to deal exclusively with tasks, and we will take care of their organization!</p>
					<div class="d-grid gap-1 d-md-flex justify-content-md-center">
						<a href="register.html" class="btn btn-primary btn-lg px-4 me-md-2">
							Try it for free
						</a>
					</div>
				</div>
			</div>

			<!-- BUG TRACKER FEATURE -->
			<div class="row flex-lg-row align-items-center g-5 py-5 my-3">
				<div class="col-10 col-sm-8 col-lg-6">
					<img src="images/bugtracker.png" class="d-block mx-lg-auto img-fluid border rounded-3 shadow-lg" alt="Bug tracker screenshot" loading="lazy">
				</div>
				<div class="col-lg-6">
					<h1 class="display-5 fw-bold lh-1 mb-3">Bug tracker for your developers and testers</h1>
					<p class="lead">Develop, test, fix, test again, and finally: shut down - that's the best part!</p>
					<div class="d-grid gap-1 d-md-flex justify-content-md-center">
						<a href="register.html" class="btn btn-success btn-lg px-4 me-md-2">
							It's free too!
						</a>
					</div>
				</div>
			</div>

			<!-- GIT FEATURE -->
			<div class="row flex-lg-row-reverse align-items-center g-5 py-5 my-3">
				<div class="col-10 col-sm-8 col-lg-6">
					<img src="images/git.png" class="d-block mx-lg-auto img-fluid border rounded-3 shadow-lg" alt="Git support screenshot" loading="lazy">
				</div>
				<div class="col-lg-6">
					<h1 class="display-5 fw-bold lh-1 mb-3">Git support</h1>
					<p class="lead">Version control (Git) support is available in the application for easy tracking of commits and changes in branches. All that remains for your team is to sip some tea.</p>
					<div class="d-grid gap-1 d-md-flex justify-content-md-center">
						<a href="downloads.html" class="btn btn-warning btn-lg px-4 me-md-2">
							Available in the app
						</a>
					</div>
				</div>
			</div>
		</div>
	</main>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
  }
}
</script>
