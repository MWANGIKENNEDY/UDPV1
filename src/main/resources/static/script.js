var myElement=document.getElementById("nav-toggle");
var isToggled=false;


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