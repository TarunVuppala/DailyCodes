let movies = [
    {
        name: "Attack on Titan",
        rating: 9.0,
        img: "attack_on_titan.jpg",
        description: "In a world where humanity resides within enormous walled cities to protect themselves from Titans, gigantic humanoid creatures, the story follows Eren Yeager and his friends who join the military to fight the Titans.",
        about: "Action, Drama, Fantasy",
        release: "2013",
        duration: "24 episodes"
    },
    {
        name: "One Punch Man",
        rating: 8.7,
        img: "one_punch_man.jpg",
        description: "Saitama, a hero who can defeat any opponent with a single punch, seeks a worthy adversary to bring excitement back to his life as a hero.",
        about: "Action, Comedy, Super Power",
        release: "2015",
        duration: "12 episodes"
    },
    {
        name: "Fullmetal Alchemist: Brotherhood",
        rating: 9.1,
        img: "fullmetal_alchemist.jpg",
        description: "Two brothers use alchemy in their quest to search for the Philosopher's Stone to restore their bodies after a failed alchemical experiment.",
        about: "Action, Adventure, Drama",
        release: "2009",
        duration: "64 episodes"
    },
    {
        name: "My Hero Academia",
        rating: 8.5,
        img: "my_hero_academia.jpg",
        description: "In a world where people with superpowers (known as Quirks) are the norm, a young boy without them enrolls in a prestigious hero academy to fulfill his dream of becoming a hero.",
        about: "Action, Comedy, Super Power",
        release: "2016",
        duration: "96 episodes"
    },
    {
        name: "Death Note",
        rating: 9.1,
        img: "death_note.jpg",
        description: "Light Yagami discovers a mysterious notebook that allows him to kill anyone whose name he writes in it. He sets out to create a utopia free of criminals, but soon faces opposition from a brilliant detective known as L.",
        about: "Mystery, Psychological, Supernatural",
        release: "2006",
        duration: "37 episodes"
    },
    {
        name: "Cowboy Bebop",
        rating: 8.9,
        img: "cowboy_bebop.jpg",
        description: "Follow the adventures of the bounty hunter Spike Spiegel and his diverse crew as they travel through space in pursuit of the galaxy's most dangerous criminals.",
        about: "Action, Adventure, Sci-Fi",
        release: "1998",
        duration: "26 episodes"
    },
    {
        name: "Spirited Away",
        rating: 8.6,
        img: "spirited_away.jpg",
        description: "Chihiro, a young girl, becomes trapped in a mysterious and magical world. To rescue her parents and find a way back home, she must navigate a realm ruled by spirits, witches, and fantastical creatures.",
        about: "Animation, Adventure, Family",
        release: "2001",
        duration: "2 hours 5 minutes"
    },
    {
        name: "Naruto",
        rating: 8.3,
        img: "naruto.jpg",
        description: "Naruto Uzumaki, a young ninja with dreams of becoming the strongest ninja and leader of his village, embarks on a journey full of challenges, friendship, and self-discovery.",
        about: "Action, Adventure, Comedy",
        release: "2002",
        duration: "220 episodes"
    },
    {
        name: "Neon Genesis Evangelion",
        rating: 8.5,
        img: "neon_genesis_evangelion.jpg",
        description: "In a post-apocalyptic world, teenagers piloting giant mechs must protect humanity from mysterious beings known as Angels. As they battle both external and internal threats, they unravel the mysteries of their existence.",
        about: "Action, Drama, Mecha",
        release: "1995",
        duration: "26 episodes"
    },
    {
        name: "Hunter x Hunter",
        rating: 9.0,
        img: "hunter_x_hunter.jpg",
        description: "Gon Freecss, a young boy, aspires to become a Hunter and find his missing father. Along the way, he forms bonds with diverse characters and faces numerous challenges in the dangerous world of Hunters.",
        about: "Action, Adventure, Fantasy",
        release: "2011",
        duration: "148 episodes"
    },
    {
        name: "Code Geass: Lelouch of the Rebellion",
        rating: 8.7,
        img: "code_geass.jpg",
        description: "Lelouch vi Britannia gains the power of Geass, allowing him to command anyone to obey his orders. He uses this power to lead a rebellion against the oppressive Britannian Empire.",
        about: "Action, Drama, Mecha",
        release: "2006",
        duration: "50 episodes"
    },
    {
        name: "My Hero Academia",
        rating: 8.5,
        img: "my_hero_academia.jpg",
        description: "In a world where people with superpowers (known as Quirks) are the norm, a young boy without them enrolls in a prestigious hero academy to fulfill his dream of becoming a hero.",
        about: "Action, Comedy, Super Power",
        release: "2016",
        duration: "96 episodes"
    },
    {
        name: "Steins;Gate",
        rating: 9.1,
        img: "steins_gate.jpg",
        description: "Rintarou Okabe accidentally discovers time travel. As he and his friends experiment with changing the past, they uncover a dark conspiracy and the consequences of altering timelines.",
        about: "Sci-Fi, Thriller",
        release: "2011",
        duration: "24 episodes"
    },
    {
        name: "Demon Slayer: Kimetsu no Yaiba",
        rating: 8.6,
        img: "demon_slayer.jpg",
        description: "Tanjiro Kamado, a young boy, becomes a demon slayer to avenge his family and save his demon-turned sister. He joins a group of skilled swordsmen to battle powerful demons and uncover the truth about his sister's condition.",
        about: "Action, Adventure, Historical",
        release: "2019",
        duration: "26 episodes"
    },
    {
        name: "Your Lie in April",
        rating: 8.6,
        img: "your_lie_in_april.jpg",
        description: "Kousei Arima, a prodigious pianist, loses the ability to hear the sound of his own music after a traumatic event. His life takes a turn when he meets a free-spirited violinist who helps him rediscover the joy of playing.",
        about: "Drama, Music, Romance",
        release: "2014",
        duration: "22 episodes"
    },
    {
        name: "Ghost in the Shell: Stand Alone Complex",
        rating: 8.5,
        img: "ghost_in_the_shell.jpg",
        description: "In a cyberpunk future, Major Motoko Kusanagi leads an elite police unit known as Section 9, tackling cybercrime, terrorism, and political intrigue in a world where humans can enhance their bodies with cybernetic implants.",
        about: "Action, Military, Sci-Fi",
        release: "2002",
        duration: "52 episodes"
    },
    {
        name: "Clannad: After Story",
        rating: 9.0,
        img: "clannad_after_story.jpg",
        description: "Follow the journey of Tomoya Okazaki as he navigates the challenges of adulthood, love, and family. The story explores the impact of choices and the enduring bond between a father and daughter.",
        about: "Drama, Romance, Slice of Life",
        release: "2008",
        duration: "24 episodes"
    },
    {
        name: "One Piece",
        rating: 8.5,
        img: "one_piece.jpg",
        description: "Monkey D. Luffy sets out on a grand adventure to become the Pirate King and find the legendary treasure known as One Piece. Along the way, he forms a diverse crew and faces formidable enemies.",
        about: "Action, Adventure, Comedy",
        release: "1999",
        duration: "1000+ episodes"
    },
    {
        name: "Re:Zero - Starting Life in Another World",
        rating: 8.5,
        img: "re_zero.jpg",
        description: "Subaru Natsuki finds himself transported to a fantasy world. When he dies, he discovers he has the ability to return to a specific point in time. He must navigate a complex web of relationships and challenges to survive.",
        about: "Drama, Fantasy, Psychological",
        release: "2016",
        duration: "25 episodes"
    },
    {
        name: "The Promised Neverland",
        rating: 8.6,
        img: "promised_neverland.jpg",
        description: "Orphans Emma, Norman, and Ray discover the dark secret behind their idyllic orphanage and must devise a plan to escape the sinister forces that control their lives.",
        about: "Horror, Mystery, Thriller",
        release: "2019",
        duration: "22 episodes"
    },
    {
        name: "Princess Mononoke",
        rating: 8.4,
        img: "princess_mononoke.jpg",
        description: "Ashitaka, cursed by a boar demon, journeys to the west to find a cure. He becomes entangled in a conflict between industrial humans and forest spirits, led by the enigmatic Princess Mononoke.",
        about: "Adventure, Fantasy",
        release: "1997",
        duration: "2 hours 14 minutes"
    },
    {
        name: "Great Teacher Onizuka",
        rating: 8.7,
        img: "great_teacher_onizuka.jpg",
        description: "Eikichi Onizuka, a former gang member, becomes a high school teacher. Using unconventional methods, he seeks to connect with his students and bring positive change to their lives.",
        about: "Comedy, Drama, School",
        release: "1999",
        duration: "43 episodes"
    },
    {
        name: "Fate/Zero",
        rating: 8.3,
        img: "fate_zero.jpg",
        description: "Seven mages summon legendary heroes to participate in the Holy Grail War, a battle for the wish-granting artifact. As alliances form and betrayals unfold, the fate of the world hangs in the balance.",
        about: "Action, Fantasy, Supernatural",
        release: "2011",
        duration: "25 episodes"
    },
    {
        name: "Gurren Lagann",
        rating: 8.7,
        img: "gurren_lagann.jpg",
        description: "Simon and Kamina, residents of an underground village, embark on an epic journey to the surface. With the help of their giant robot, they defy destiny and face powerful foes.",
        about: "Action, Adventure, Comedy",
        release: "2007",
        duration: "27 episodes"
    },
    {
        name: "Tokyo Ghoul",
        rating: 8.0,
        img: "tokyo_ghoul.jpg",
        description: "After a chance encounter with a flesh-eating ghoul, Ken Kaneki becomes a half-ghoul, struggling to find his place in a world where humans and ghouls exist in a fragile balance.",
        about: "Action, Drama, Horror",
        release: "2014",
        duration: "24 episodes"
    },
    {
        name: "Paranoia Agent",
        rating: 8.0,
        img: "paranoia_agent.jpg",
        description: "A series of mysterious attacks by a rollerblading assailant known as Lil' Slugger confound the police and lead to a surreal investigation into the nature of reality and societal pressures.",
        about: "Mystery, Drama, Psychological",
        release: "2004",
        duration: "13 episodes"
    },
    {
        name: "Black Clover",
        rating: 7.8,
        img: "black_clover.jpg",
        description: "Asta, a boy born without magic, aspires to become the Wizard King. Alongside his rival Yuno, who possesses extraordinary magical abilities, Asta embarks on a journey to achieve his dream.",
        about: "Action, Comedy, Fantasy",
        release: "2017",
        duration: "170+ episodes"
    },
    {
        name: "Serial Experiments Lain",
        rating: 8.1,
        img: "serial_experiments_lain.jpg",
        description: "Lain Iwakura, a teenage girl, becomes immersed in the virtual world of the Wired. As she explores the boundaries between reality and the digital realm, she unravels the mysteries of existence.",
        about: "Drama, Mystery, Psychological",
        release: "1998",
        duration: "13 episodes"
    },
    {
        name: "Erased",
        rating: 8.5,
        img: "erased.jpg",
        description: "Satoru Fujinuma possesses the ability to go back in time moments before a life-threatening event. When accused of a crime he didn't commit, he uses his power to uncover the truth and prevent a tragedy from his past.",
        about: "Mystery, Psychological, Supernatural",
        release: "2016",
        duration: "12 episodes"
    },
    {
        name: "Haikyuu!!",
        rating: 8.7,
        img: "haikyuu.jpg",
        description: "Shoyo Hinata, inspired by a short player, joins a high school volleyball team. Despite facing taller opponents, he and his teammates strive to become the best in the challenging world of high school volleyball.",
        about: "Comedy, Drama, Sports",
        release: "2014",
        duration: "85 episodes"
    },
    {
        name: "Gintama",
        rating: 9.0,
        img: "gintama.jpg",
        description: "Gintoki Sakata, a former samurai, navigates a world where aliens have invaded Edo Japan. Alongside his eccentric friends, he takes on odd jobs and confronts powerful foes with humor and determination.",
        about: "Action, Comedy, Sci-Fi",
        release: "2006",
        duration: "367 episodes"
    },
    {
        name: "Dragon Ball Z",
        rating: 8.7,
        img: "dragon_ball_z.jpg",
        description: "Goku and his friends defend the Earth against powerful foes, exploring the world of martial arts, superpowers, and space adventures.",
        about: "Action, Adventure, Fantasy",
        release: "1989",
        duration: "291 episodes"
    }, {
        name: "Code Geass: Lelouch of the Rebellion",
        rating: 8.7,
        img: "code_geass.jpg",
        description: "Lelouch vi Britannia gains a mysterious power, Geass, and leads a rebellion against the Britannian Empire to achieve justice for his sister and alter the course of history.",
        about: "Action, Drama, Mecha",
        release: "2006",
        duration: "50 episodes"
    },
    {
        name: "Sword Art Online",
        rating: 7.6,
        img: "sword_art_online.jpg",
        description: "Players get trapped in a virtual reality MMORPG, and protagonist Kirito must navigate the virtual world to survive and uncover the mysteries behind their predicament.",
        about: "Action, Adventure, Fantasy",
        release: "2012",
        duration: "96 episodes"
    },
    {
        name: "Tokyo Ghoul",
        rating: 7.9,
        img: "tokyo_ghoul.jpg",
        description: "Ken Kaneki, a college student, becomes a half-ghoul after a chance encounter, and he must navigate a world where ghouls prey on humans while hiding his identity.",
        about: "Action, Drama, Horror",
        release: "2014",
        duration: "48 episodes"
    },
    {
        name: "Neon Genesis Evangelion",
        rating: 8.5,
        img: "neon_genesis_evangelion.jpg",
        description: "Teenagers pilot giant mechs to protect Earth from mysterious beings known as Angels, but the psychological toll and conspiracies complicate their battle for survival.",
        about: "Action, Drama, Mecha",
        release: "1995",
        duration: "26 episodes"
    },
    {
        name: "Death Parade",
        rating: 8.3,
        img: "death_parade.jpg",
        description: "In the afterlife, individuals must play games to determine their fate. Decim, an arbiter, oversees these games and uncovers the depths of human emotions and stories.",
        about: "Drama, Mystery, Psychological",
        release: "2015",
        duration: "12 episodes"
    },
    {
        name: "Mob Psycho 100",
        rating: 8.5,
        img: "mob_psycho_100.jpg",
        description: "Shigeo Kageyama, also known as Mob, possesses powerful psychic abilities but seeks a normal life while facing supernatural threats and navigating adolescence.",
        about: "Action, Comedy, Supernatural",
        release: "2016",
        duration: "25 episodes"
    },
    {
        name: "Black Clover",
        rating: 7.5,
        img: "black_clover.jpg",
        description: "Asta, a magicless boy, aspires to become the Wizard King by overcoming his lack of magic and competing with his rival, Yuno, in a magical world.",
        about: "Action, Comedy, Fantasy",
        release: "2017",
        duration: "170+ episodes"
    },
    {
        name: "Fire Force",
        rating: 7.9,
        img: "fire_force.jpg",
        description: "In a world where spontaneous human combustion turns people into infernals, Shinra Kusakabe joins the Fire Force to battle these supernatural threats and uncover the truth.",
        about: "Action, Supernatural",
        release: "2019",
        duration: "50+ episodes"
    },
    {
        name: "Jujutsu Kaisen",
        rating: 8.7,
        img: "jujutsu_kaisen.jpg",
        description: "Yuji Itadori, a high school student, joins a secret organization to battle cursed spirits after consuming a powerful, cursed artifact.",
        about: "Action, Dark Fantasy, Supernatural",
        release: "2020",
        duration: "24 episodes"
    },
    {
        name: "Vinland Saga",
        rating: 8.5,
        img: "vinland_saga.jpg",
        description: "Thorfinn, a young warrior, seeks revenge against the man who killed his father, all while being entangled in the events of the Viking Age.",
        about: "Action, Adventure, Historical",
        release: "2019",
        duration: "24 episodes"
    },
    {
        name: "Beastars",
        rating: 8.5,
        img: "beastars.jpg",
        description: "In a world of anthropomorphic animals, the relationship between herbivores and carnivores is explored through the experiences of Legoshi, a timid wolf, and other students at Cherryton Academy.",
        about: "Drama, Mystery, Psychological",
        release: "2019",
        duration: "24 episodes"
    },
]

const search = () => {
    let inputValue = document.getElementById("search-input").value;
    // console.log(inputValue);
    let res = movies.filter((movie) => {
        return movie.name.toLowerCase().includes(inputValue.toLowerCase());
    })
    showMovies(res);
}
// console.log(movies.length);

// const showAbout=()=>{
//     let about=document.getElementsByClassName("about");
//     about.style.opacity="1";
//     console.log("Enter");
// }


// let moviesContainer = document.querySelector(".movies-container");
const showMovies=(data)=>{

    let newMovie = ``
    for (let i = 0; i < data.length; i++) {
        // let newMovie=document.createElement("div");
        // newMovie.classList().add("movie");
        newMovie += `<div class="movie">
        <div class="about" onmouseover="playVideo(${i})" onmouseout="pauseVideo(${i})">
        <div class="vid">
        <video class="video" src="https://www.w3schools.com/tags/movie.mp4" type="video/mp4" muted
        loop></video>
        </div>
        <div class="details">
        <h1>${data[i].name}</h1>
        <h2>${data[i].rating}</h2>
        <h3>${data[i].release}</h3>
        </div>
        </div>
        <div class="poster">
        <img class="poster-img" src="https://miro.medium.com/v2/resize:fit:1400/1*gSf4BaxPPuSqU_a5WgSyRA.jpeg" alt="${data[i].name}poster">
        </div>
        </div>
        `
        // moviesContainer.appendChild(newMovie);
    }
    document.getElementsByClassName("movie-container")[0].innerHTML = newMovie;
    // console.log(newMovie);
}

    
    
// let video = document.querySelector(".video");
// let about = document.querySelector(".about");

// about.addEventListener("mouseover", () => {
//     video.currentTime = 0;
//     video.play();
// })

// about.addEventListener("mouseout", () => {
//     video.pause();

// })

const playVideo = (i) => {
    let video = document.getElementsByClassName("video")[i];
    // console.log(video)
    video.currentTime = 0;
    video.play()
}

const pauseVideo = (i) => {
    let video = document.getElementsByClassName("video")[i];
    video.pause()
    // video.currentTime = 0;
}

showMovies(movies)