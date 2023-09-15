const cardData = [{
        title: 'CPU',
        text: 'The brain of the computer',
        img: 'cpu.jpeg',
        link:'https://www.youtube.com/watch?v=cNN_tTXABUA',
        relevance: 5
    },
    {
        title: 'RAM',
        text: 'Short term memory',
        img: 'ram.jpeg',
        link:'https://www.youtube.com/watch?v=7J7X7aZvMXQ',
        relevance: 5
    },
    {
        title: 'Motherboard',
        text: 'Main printed circuit board ',
        img: 'motherboard.jpeg',
        link:'https://www.youtube.com/watch?v=b2pd3Y6aBag',
        relevance: 5
    },
    {
        title: 'Harddrive',
        text: 'Magnetic storage medium',
        img: 'harddrive.webp',
        link:'https://www.youtube.com/watch?v=wtdnatmVdIg',
        relevance: 5
    },
    {
        title: 'SSD',
        text: 'Solid State Drive',
        img: 'harddrive.webp',
        link:'https://images.pexels.com/photos/2942361/pexels-photo-2942361.jpeg',
        relevance: 5
    },   {
        title: 'Graphics Card',
        text: 'Generates the video signal',
        img: 'graphics card.jpeg',
        link:'https://www.youtube.com/watch?v=Kgcfj_KV-mo',
        relevance: 5
    }
];


/* Main action of function */
let setDataCardNoX = no => {
/* helper functions */
    let  setSingleDataText = (no, htmlName, dataName) => cardsList[no].getElementsByClassName(htmlName)[0].innerHTML = cardData[no][dataName];
    let  setSingleDataSrc = (no, htmlName, dataName) => cardsList[no].getElementsByClassName(htmlName)[0].setAttribute("src", cardData[no][dataName]);
    let  setSingleDataLink = (no, htmlName, dataName) => cardsList[no].getElementsByClassName(htmlName)[0].setAttribute("href", cardData[no][dataName]);
    setSingleDataText(no, "card-title", "title");
    setSingleDataSrc(no, "card-img", "img");
    setSingleDataText(no, "card-text", "text");
    setSingleDataLink(no, "card-link", "link");
}

let getFirstCard = (no,htmlName) => cardsList[no].getElementsByClassName(htmlName);
// Add cards to cards
const firstCard = document.getElementsByClassName("card")[0];
const cards = document.getElementsByClassName("cards")[0];
// Add childs 
for (let i = 1; i <= cardData.length - 1; i++)
    cards.appendChild(firstCard.cloneNode(true));
// Fill all cards with the data
const cardsList = document.getElementsByClassName("card");
for (let i = 0; i < cardsList.length; i++)
    setDataCardNoX(i);