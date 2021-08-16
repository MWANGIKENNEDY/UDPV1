var myElement=document.getElementById("nav-toggle");
var isToggled=false;

document.addEventListener('DOMContentLoaded',()=>{
    console.log("DOM loaded");
    setInterval(()=>{
        myTestFunction();
        testFetch();
        console.log("hey");
    },2000);
});

const myTestFunction=()=>{
    $("#testtable").load(location.href + " #testtable");
}

const testFetch=()=>{
    fetch('http://localhost:8080/hello')
        .then(response => response.json())
        .then(json => console.log(json))
}


const myTabs=document.querySelectorAll('[data-target]');
const myTabsContent=document.querySelectorAll('[data-content]');

myTabs.forEach((myTab)=>{
    myTab.addEventListener("click",(e)=>{
        const target=document.querySelector(myTab.dataset.target);
        myTabsContent.forEach((myTabContent)=>{
            myTabContent.classList.remove('active');
        });
        myTabs.forEach((myTab)=>{
            myTab.classList.remove('active');
        });
        myTab.classList.add('active');
        target.classList.add('active');
    })
})

const myLinks=document.querySelectorAll('[data-display]');
const myContainers=document.querySelectorAll('[data-propagate]');

myLinks.forEach((myLink)=>{
    myLink.addEventListener("click",(e)=>{
        const target=document.querySelector(myLink.dataset.display);
        myContainers.forEach((myContainer)=>{
            myContainer.classList.remove('active');
        });
        myLinks.forEach((myLink)=>{
            myLink.classList.remove('active');
        });
        myLink.classList.add('active');
        target.classList.add('active');
    })
})

myElement.addEventListener("click",()=>{
    
    if(isToggled){
        document.getElementsByClassName("sidenav")[0].style.transform = "translate(0vw)";
        document.getElementsByClassName("layout-wrapper")[0].style.marginLeft="17vw";
        isToggled =! isToggled;
    }
    else{
        document.getElementsByClassName("sidenav")[0].style.transform = "translate(-17vw)";
        document.getElementsByClassName("layout-wrapper")[0].style.marginLeft="0vw";
        isToggled =! isToggled;
    }

    //
});


const hello = ()=>{
    alert("hello kennedy");
}

function updateEventCount() {
    $.get("event-count").done(function(fragment) { // get from controller
        $("#eventCount").replaceWith(fragment); // update snippet of page
    });
}

window.addEventListener("scroll",()=>{
    const navigation=document.getElementsByClassName("nav-bar")[0];
    const sidenavigation=document.getElementsByClassName("sidenav")[0];

    navigation.classList.toggle("sticky",window.scrollY > 0);
    sidenavigation.classList.toggle("sticky-sidenav",window.scrollY > 0);

});