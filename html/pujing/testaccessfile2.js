// JavaScript Document

function previewFiles() {

  var preview = document.querySelector('#preview');
  var files   = document.querySelector('input[type=file]').files;

  function readAndPreview(file) {

    // 确保 `file.name` 符合我们要求的扩展名
    if ( /\.(jpe?g|png|gif)$/i.test(file.name) ) {
      var reader = new FileReader();

      reader.addEventListener("load", function () {
        var image = new Image();
        image.height = 100;
        image.title = file.name;
        image.src = this.result;
        preview.appendChild( image );
      }, false);

      reader.readAsDataURL(file);
    }

  }

  if (files) {
    [].forEach.call(files, readAndPreview);
  }

}