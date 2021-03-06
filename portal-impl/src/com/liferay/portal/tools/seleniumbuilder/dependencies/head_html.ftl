<head>
	<script type='text/javascript'>
		function radioCheck () {
			if (document.getElementById("actionCommandLogButton").checked){
				document.getElementById("actionCommandLog").style.display = "block";
				document.getElementById("seleniumCommandLog").style.display = "none";
			}
			else if (document.getElementById("seleniumCommandLogButton").checked){
				document.getElementById("actionCommandLog").style.display = "none";
				document.getElementById("seleniumCommandLog").style.display = "block";
			}
		}

		function toggle(event) {
			var node;

			if (event.srcElement == undefined) {
				node = event.target;
			}
			else {
				node = event.srcElement;
			}

			var id = node.getAttribute("id");

			var firstChar = id.charAt(0);

			id = firstChar.toUpperCase() + id.slice(1);

			if (id != null) {
				if (node.innerHTML == "-") {
					node.innerHTML = "+";

					document.getElementById("collapse" + id).style.display = "none";
				}
				else if (node.innerHTML == "+") {
					node.innerHTML = "-";

					document.getElementById("collapse" + id).style.display = "block";
				}
			}
		}
	</script>

	<style>
		body {
			font-family: verdana;
			font-size: 12px;
			line-height: 1.75em;
			margin-bottom: 0px;
			padding: 0px;
		}

		input[type=radio] {
			display: none;
		}

		input[type=radio] + label {
			background-color: #e7e7e7;
			display: inline-block;
			padding: 4px 12px;
		}

		input[type=radio]:checked + label {
			background-color: #d0d0d0;
		}

		li {
			display: block;
		}

		ul {
			display: block;
			list-style-type: none;
		}

		#actionCommandLog {
			border: 1px solid #CCC;
			height: 30%;
			overflow: auto;
			white-space: nowrap;
			width: 100%;
		}

		#errorLog {
			border: 1px solid #CCC;
			height: 12%;
			overflow: auto;
			white-space: nowrap;
			width: 100%;
		}

		#pageObjectXMLLog {
			height: 64%;
			margin: 0px;
			overflow: auto;
			padding: 0px;
			width: 100%;
		}

		#seleniumCommandLog {
			border: 1px solid #CCC;
			height: 30%;
			overflow: auto;
			white-space: nowrap;
			width: 100%;
		}

		#title {
			margin: 0px;
			max-height: 5%;
			padding: 0px;
			width: 100%;
		}

		.arrow {
			color: blue;
		}

		.attribute {
			color: purple;
		}

		.collapse {
			display: none;
		}

		.expand-line {
			cursor: pointer;
			font-weight: bold;
		}

		.expand-toggle {
			cursor: pointer;
			float: left;
			margin-right: 5px;
			width: 8px;
		}

		.fail {
			background-color: #FF8B8B;
		}

		.line-number {
			color: black;
			float: right;
			margin-left: 5px;
			margin-right: 5px;
		}

		.parameter-border {
			background-color: white;
			border-style: inset;
			color: darkgray;
			margin-left: 38px;
		}

		.parameter-value {
			color: black;
		}

		.pass {
			background-color: #B5FF8B;
		}

		.pending {
			background-color: #FBFF8B;
		}

		.quote {
			color: deeppink;
		}

		.skip {
			background-color: lightgray;
		}

		.tag {
			color: green;
		}
	</style>
</head>