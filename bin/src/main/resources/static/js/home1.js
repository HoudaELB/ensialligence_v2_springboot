(function($) {
    "use strict"; // Start of use strict



    // Popup Singin
    $(".btn-grp").click(function(e) {
        e.preventDefault();
        $(".creat-team").css('display','flex');
    });
    $(".cloose").click(function(e) {
        e.preventDefault();
        $(".creat-team").css('display','none');
    });


})(jQuery);