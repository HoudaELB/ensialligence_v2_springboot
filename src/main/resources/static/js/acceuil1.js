(function($) {
    "use strict"; // Start of use strict

    // Closes the sidebar menu
    $(".menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
        $(".menu-toggle > .fa-bars, .menu-toggle > .fa-times").toggleClass("fa-bars fa-times");
        $(this).toggleClass("active");
    });

    // Popup Singin
    $("#singin").click(function(e) {
        e.preventDefault();
        $(".bg-modal").css('display','flex');
    });
    $(".cloose").click(function(e) {
        e.preventDefault();
        $(".bg-modal").css('display','none');
    });


})(jQuery);