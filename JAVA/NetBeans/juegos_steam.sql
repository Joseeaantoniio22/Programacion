-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-05-2024 a las 13:27:48
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `juegos_steam`
--
CREATE DATABASE IF NOT EXISTS `juegos_steam` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `juegos_steam`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favorito`
--

CREATE TABLE `favorito` (
  `id_usuario` int(11) NOT NULL,
  `id_videojuego` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `favorito`
--

INSERT INTO `favorito` (`id_usuario`, `id_videojuego`) VALUES
(100, 398150),
(100, 414740),
(100, 495010),
(100, 578210),
(100, 594820),
(100, 658800);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `videojuego`
--

CREATE TABLE `videojuego` (
  `identificador` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(900) NOT NULL,
  `imagen` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `videojuego`
--

INSERT INTO `videojuego` (`identificador`, `nombre`, `fecha`, `precio`, `descripcion`, `imagen`) VALUES
(29570, 'Guild Wars Trilogy', 'Apr 22, 2009', 29.99, 'An award-winning online fantasy epic awaits. No subscription fees! Step into Guild Wars, the award-winning fantasy online roleplaying game enjoyed by millions of players. For the first time ever, Guild Wars Trilogy combines Guild Wars, Factions and Nightfall into a single amazing experience.', 'https://cdn.akamai.steamstatic.com/steam/apps/29570/header.jpg?t=1598613661'),
(204450, 'Call of Juarez: Gunslinger', 'May 22, 2013', 14.99, 'From the dust of a gold mine to the dirt of a saloon, Call of Juarez Gunslinger is a real homage to the Wild West tales. Live the epic and violent journey of a ruthless bounty hunter on the trail of the Wests most notorious outlaws', 'https://cdn.akamai.steamstatic.com/steam/apps/204450/header.jpg?t=1639076472'),
(295910, 'Olympia Rising', 'Jul 23, 2015', 4.99, 'Olympia Rising is a 2-D action platformer starring Iola - a young warrior who has been cast into the Underworld after meeting an untimely end. She must navigate through the various twisted regions of Hades domain, fighting through hoards of deadly creatures as she attempts her escape, making her way to Mount Olympus.', 'https://cdn.akamai.steamstatic.com/steam/apps/295910/header.jpg?t=1447361510'),
(316810, 'Shadowcrypt', 'Sep 15, 2014', 4.99, 'Shadowcrypt is an arcade-style dungeon crawler with tactical sword &amp; shield combat. Find the Necromancer and defeat his horde of undead warriors through a series of labyrinthine rooms.', 'https://cdn.akamai.steamstatic.com/steam/apps/316810/header.jpg?t=1601926535'),
(373870, 'Sisters Secrecy: Arcanum Bloodlines - Premium', 'May 28, 2015', 6.99, 'Welcome to dangerous adventure! Help to find one of the lost twin sisters in the world, where the time has stood still and the magic filled the air.', 'https://cdn.akamai.steamstatic.com/steam/apps/373870/header.jpg?t=1493888497'),
(398150, 'Ace of Protectors', 'Jun 27, 2016', 1.99, 'Be a hero. Be the Ace of Protectors. According to the legend of the Venux, youre who can save the Venux. You have to fight devils who are trying to destroy the Venux.', 'https://cdn.akamai.steamstatic.com/steam/apps/398150/header.jpg?t=1572138304'),
(411350, 'Quicken Legal Business Pro', 'Jan 26, 2016', 0, 'ou dont need an attorney to start and run a business -- most of the legal work involved simply requires reliable information and the right legal forms. With Quicken Legal Business Pro, youll get everything you need to get the job done.', 'https://cdn.akamai.steamstatic.com/steam/apps/411350/header.jpg?t=1551916719'),
(414740, 'RAID: World War II', 'Sep 26, 2017', 19.99, 'RAID: World War II is an action-packed four player cooperative shooter set during a time when the Nazi war machine was still winning, and hope was in short supply.', 'https://cdn.akamai.steamstatic.com/steam/apps/414740/header.jpg?t=1598449744'),
(493620, 'VR Disc Golf', 'Jul 18, 2016', 9.99, 'VR Disc Golf is an online multi-player disc golf game where you can throw, chuck, and fly your way to victory through two virtual outrun environments. Includes over 40 great audio tracks. Single-player and local multi-player are also available. Play disc golf in virtual reality with your friends!', 'https://cdn.akamai.steamstatic.com/steam/apps/493620/header.jpg?t=1475263619'),
(495010, 'Ranger of the jungle', 'Jul 18, 2016', 3.99, 'The elves in Jade Forest possess the Eternal Power, which was coveted by the King of demons who summoned the Demonic Circle and commanded Hellhounds, Fallen Angels and Orcs to invade the realm of elves.The elves were outnumbered and you must convene your former colleagues, lead the team, control the battle, guarantee the supplies, then...', 'https://cdn.akamai.steamstatic.com/steam/apps/495010/header.jpg?t=1471845185'),
(498940, 'WarBirds Dawn of Aces, World War I Air Combat', 'Jul 19, 2016', 14.99, 'WarBirds, Dawn of Aces, is a single player, (thousands of different missions), and massively multiplayer combat simulation of the first combat aircraft dogfights during World War I, 1914-1918! WarBirds, Dawn of Aces is a graphically excellent, historically correct, and exciting simulation flying game for arcade, realistic, and expert...', 'https://cdn.akamai.steamstatic.com/steam/apps/498940/header.jpg?t=1639586162'),
(500150, 'Time Gap', 'Jan 15, 2018', 0, 'Time Gap is one of the best hidden object games with beautifully drawn hidden object scenes, match 3 puzzles, bubble mini-games and amazing adventure plot. Only you can solve the secret of sudden disappearance of the mankind!', 'https://cdn.akamai.steamstatic.com/steam/apps/500150/header.jpg?t=1651151132'),
(528610, 'Double Dragon IV', 'Jan 30, 2017', 6.99, 'The classical side-scroll action game, Double Dragon series newest sequel! A new legend begins!!', 'https://cdn.akamai.steamstatic.com/steam/apps/528610/header.jpg?t=1634699448'),
(551720, 'Unearthed Inc: The Lost Temple', 'Dec 16, 2016', 0, 'Explore the Lost Temple in this thrilling virtual reality adventure! Pair up with your sidekick Droid, solve ancient puzzles, fight a giant spider, and wreak havoc with your telekinetic powers!', 'https://cdn.akamai.steamstatic.com/steam/apps/551720/header.jpg?t=1534175982'),
(578210, 'A-Tech Cybernetic VR', 'Mar 27, 2020', 14.99, 'Built exclusively for VR, A-Tech Cybernetics Story Mode will offer hours of explosive fun, while Swarm Mode will test your grit in a sci-fi nightmare scenario. Stop the mutant invasion at a futuristic megacorp, controlling an arsenal of weapons with real life movements!', 'https://cdn.akamai.steamstatic.com/steam/apps/578210/header.jpg?t=1608622929'),
(585560, 'Finnish Roller', 'Jan 31, 2017', 0.49, 'Indie ball game, where target is to pass different tracks avoiding obstacles which causes damage. You can play with keyboard and also partial controller support is available', 'https://cdn.akamai.steamstatic.com/steam/apps/585560/header.jpg?t=1641366277'),
(585860, 'Bunker 58', 'Jun 7, 2017', 1.99, 'Locked inside of Bunker 58 with major threats surrounding you, you question yourself how much you value your life, and how much you will kill to keep it.', 'https://cdn.akamai.steamstatic.com/steam/apps/585860/header.jpg?t=1496942641'),
(594820, 'An Oath to the Stars', 'Aug 3, 2017', 0, 'Left for dead by her closest friend and comrade, Hoshiko is now looking for revenge. Follow her in this modern hardcore danmaku SHMUP about revenge, friendship and honour.', 'https://cdn.akamai.steamstatic.com/steam/apps/594820/header.jpg?t=1567188740'),
(595060, 'Lionheart: Legacy of the Crusader', 'Mar 15, 2017', 9.99, 'A champion will rise and change the course of history. As a descendent of King Richard the Lionheart, prepare to battle the forces of evil in an alternate Europe transformed by magic. Choose your race, skills, and abilities, and begin your quest in this darkened alternative world.', 'https://cdn.akamai.steamstatic.com/steam/apps/595060/header.jpg?t=1634849931'),
(658800, 'Fantasy Mosaics 16: Six Colors in Wonderland', 'Jul 10, 2017', 6.99, 'This time the penguin family is taking a trip to the multi-color wonderland! They are going to discover a new collection of mosaic puzzles with up to six colors! This innovation opens up a whole new dimension of challenge and brings you many hours of entertainment.', 'https://cdn.akamai.steamstatic.com/steam/apps/658800/header.jpg?t=1499670087'),
(667720, 'Red Faction Guerrilla Re-Mars-tered', 'Jul 3, 2018', 19.99, 'Red Faction: Guerrilla re-defines the limits of destruction-based game-play with a huge open-world, fast-paced guerrilla-style combat, and true physics-based destruction.', 'https://cdn.akamai.steamstatic.com/steam/apps/667720/header.jpg?t=1591103504'),
(693030, 'Neo Angle', 'Oct 20, 2017', 0.99, 'Retro inspired Minimal puzzle game.', 'https://cdn.akamai.steamstatic.com/steam/apps/693030/header.jpg?t=1509907238'),
(725950, 'Zombie Nightmare', 'Oct 29, 2017', 4.99, 'Defend yourself from waves of zombies! Support SteamVR', 'https://cdn.akamai.steamstatic.com/steam/apps/725950/header.jpg?t=1509270289'),
(767980, 'Multi-Quest', 'Jan 26, 2018', 0.99, 'Do you crave adventure? Cats? Maybe just something to take up time. Well all of that can be found here in Multi-Quest!', 'https://cdn.akamai.steamstatic.com/steam/apps/767980/header.jpg?t=1517017714'),
(807870, 'Survival Planet', 'Mar 26, 2018', 9.99, 'Stranded in alien planet, you need to find your crew while trying to survive and contact the earth', 'https://cdn.akamai.steamstatic.com/steam/apps/807870/header.jpg?t=1530346008'),
(830850, 'Dragons Eye', 'Aug 14, 2020', 34.99, 'Dragons Eye is an action adventure game filled with fast paced combat against dangerous creatures in an ever changing open world. Play your way through this adventure as Yen, a brave knight trying to prove his might against Gonti, a dragon that is hellbent on destroying everything in sight.', 'https://cdn.akamai.steamstatic.com/steam/apps/830850/header.jpg?t=1618200733'),
(856750, 'Metanoia', 'May 23, 2018', 2.99, 'An first person adventure set inside the mind. Explore the island that is your mind and find portals to worlds, each showcasing a mental illness.', 'https://cdn.akamai.steamstatic.com/steam/apps/856750/header.jpg?t=1527940603'),
(868510, 'The Outsiders', 'Jun 18, 2018', 2.99, 'The Outsiders is a sci-fi top-down survival shooter, a fun little indie game where you play as the Alien Boss slaying humans who are invading your planet! Be the Boss, destroy multiple enemies with a single blow or all of them with your badass power!', 'https://cdn.akamai.steamstatic.com/steam/apps/868510/header.jpg?t=1572457103'),
(914710, 'Cat Quest II', 'Sep 24, 2019', 14.99, 'Open-world action-RPG in a fantasy realm of cats and dogs. Sequel to the award-winning original, CAT QUEST II lets you play solo or with a friend, as both a cat and dog! Quest in a world filled with magic, defeat monsters and collect loot in a catventure like never before!', 'https://cdn.akamai.steamstatic.com/steam/apps/914710/header.jpg?t=1644409726'),
(958850, 'Let It Flow', 'Mar 5, 2021', 0, 'What happens when you let your Youtube community make a game? Well, youre looking at it. Chat tells me what to make and so I build it for them. I have no choice but to fulfill their wishes. Dont judge me.', 'https://cdn.akamai.steamstatic.com/steam/apps/958850/header.jpg?t=1615500196'),
(968210, 'Predicate', 'Nov 16, 2018', 9.99, 'Predicate is a fast paced bullet-hell with a colorful palette and challenging bosses. Move fast and crush enemies as one character, carefully maneuver and shoot enemies as another.', 'https://cdn.akamai.steamstatic.com/steam/apps/968210/header.jpg?t=1542414792'),
(984990, 'Alien Jelly: Food For Thought!', 'Sep 2, 2019', 9.99, 'Alien Jelly delivers on 50 levels of thoughtful puzzle design, mixed with weird and lovable characters packaged in a 50s b-movie sci-fi environment.', 'https://cdn.akamai.steamstatic.com/steam/apps/984990/header.jpg?t=1588635705'),
(987150, 'BMX The Game', 'Aug 28, 2020', 24.99, 'BMX The Game is a realistic bike game that captures the essence of this sport. Designed by BMX riders and lovers, it recreates the beauty, creativity, fun and variety of the BMX universe in an open-world game, set in the emblematic city of Barcelona.', 'https://cdn.akamai.steamstatic.com/steam/apps/987150/header.jpg?t=1611741754'),
(998630, 'Fated Era', 'Feb 11, 2019', 8.99, 'Battle across procedurally generated levels in this retro Strategy RPG. Move troops in real time and watch battles play out where preparation and strategy are key. Customize new games in tons of different ways and levels of difficulty to play the way you want.', 'https://cdn.akamai.steamstatic.com/steam/apps/998630/header.jpg?t=1573152188'),
(1047480, 'Miner Lou', 'May 30, 2019', 0, 'Mine and combine gems for your defenses. Play Arcade Mode and accompany Lou on a journey to save the Star Babies.', 'https://cdn.akamai.steamstatic.com/steam/apps/1047480/header.jpg?t=1614745912'),
(1048600, 'Stela', 'Mar 13, 2020', 19.99, 'Stela is a cinematic, atmospheric platformer about a young woman witnessing the final days of a mysterious ancient world.', 'https://cdn.akamai.steamstatic.com/steam/apps/1048600/header.jpg?t=1598893004'),
(1055120, 'CoronaViruses', 'Jan 24, 2021', 0.99, 'Be quick to think, as you progress in the game you use more and more logic in a fun puzzle.', 'https://cdn.akamai.steamstatic.com/steam/apps/1055120/header.jpg?t=1611535838'),
(1073620, 'Not So Heart', 'Jul 11, 2019', 4.99, 'Not So Heart is a retro hardcore platformer. But it has a secret. Dont try to fix anything.', 'https://cdn.akamai.steamstatic.com/steam/apps/1073620/header.jpg?t=1564754341'),
(1105420, 'Game of Thrones Winter is Coming', 'Nov 14, 2019', 0, 'Game of Thrones Winter is Coming is a PC strategy game based on the HBO drama television series, officially licensed by Warner Bros. Interactive Entertainment under HBO, and developed and published by YOOZOO Games. Interactive Entertainment and HBO.', 'https://cdn.akamai.steamstatic.com/steam/apps/1105420/header.jpg?t=1583118085'),
(1114030, 'The Room Syndrome', 'Nov 1, 2019', 0, 'Explore the mysterious room by traversing time, while you watch a man succumb to the room syndrome.', 'https://cdn.akamai.steamstatic.com/steam/apps/1114030/header.jpg?t=1575858312'),
(1114110, 'Nightmare Game', 'Jul 19, 2019', 0.99, 'Stay in a warehouse for 24 days,You can get a $1,000,000 as bonus! Eight people,Think differently. It is not so easy to get a bonus! Through eight different perspectives of roles. Uncover the fog step by step! Finally let you know the truth! Nightmare Game is a suspense plot game, rich plot is the characteristics of this game.', 'https://cdn.akamai.steamstatic.com/steam/apps/1114110/header.jpg?t=1619581572'),
(1157850, 'Interphase', 'Feb 12, 2020', 6.99, 'As a rogue dreamer, you have to enter the mainframe and direct your partner to the track itself - the minds of every future generation will be trusting to your skill and intellect.', 'https://cdn.akamai.steamstatic.com/steam/apps/1157850/header.jpg?t=1614366078'),
(1174170, 'Earthshine', 'Dec 9, 2019', 1.99, 'Explore a deeply emotional story about love and sacrifice, and the hope that exists in us all.', 'https://cdn.akamai.steamstatic.com/steam/apps/1174170/header.jpg?t=1645033996'),
(1197160, 'Code 3: Police Response', 'Jun 15, 2022', 14.99, 'Code 3 is a tactical police based first person shooter developed for the PC made by police and police support personnel.', 'https://cdn.akamai.steamstatic.com/steam/apps/1197160/header.jpg?t=1656180496'),
(1200610, 'Jitsumis Gaming Overlay', 'Dec 11, 2019', 4.99, 'Jitsumis Gaming Overlay is a lightweight program that is meant to provide conveniences to gamers around the world. We do this by allowing users to have quick access to default apps or custom user-added programs and allow quick access to make other features with a click of a button.', 'https://cdn.akamai.steamstatic.com/steam/apps/1200610/header.jpg?t=1576217143'),
(1222790, 'Crossing Frontier', 'Jul 13, 2022', 0, 'Crossing Frontier is a side-scroll action game with brawling elements, , featuring multiplayer PVP content and the thrilling combat! Bring your A-Game and join the fight!', 'https://cdn.akamai.steamstatic.com/steam/apps/1222790/header.jpg?t=1657765663'),
(1254390, 'Toxastra', 'Dec 19, 2021', 5.99, 'Toxastra is a science fiction top-down shooter-RPG where you take control of Dale Custerâ€”the chief of security aboard the CFV Janus, a ship of colonization mining. After an explosion that has plunged you into a coma, you wake up in the chaos of the ship invaded by mutants.', 'https://cdn.akamai.steamstatic.com/steam/apps/1254390/header.jpg?t=1639921101'),
(1260560, 'Line Simulator', 'Feb 6, 2021', 9.99, 'Punch, throw, steal your way to the front of the line in Line Simulator! Find new and bizarre ways to skip the line in five unique environments. Explore the halls of a convention, push your way to the front of a supermarket queue, and discover that not everything is what it seems in this wacky game!', 'https://cdn.akamai.steamstatic.com/steam/apps/1260560/header.jpg?t=1646437815'),
(1302700, 'Realm of the hero', 'May 23, 2020', 4.99, 'Everything in this game like JRPG is random. Choose one in many classes to destroy enemies. You are a hero. Strengthen yourself before fighting very strong bosses. Try to learn skills and equip weapons in the adventure.', 'https://cdn.akamai.steamstatic.com/steam/apps/1302700/header.jpg?t=1590265512'),
(1304310, 'Ace of Space', 'Jul 9, 2020', 1.99, 'You and your spaceship versus thousands of aliens! Blast through waves of aliens with upgradable spaceships in this sci-fi shoot em up game and become the Ace of Space!', 'https://cdn.akamai.steamstatic.com/steam/apps/1304310/header.jpg?t=1600008506'),
(1316310, 'WAVE RIDER', 'Dec 22, 2020', 3.99, 'WAVE RIDER is a fast racing game where gravity-defying machines meet at the finish line to return control to a virtual world. Race through many bending roads, make waves with your machine to gain power, and boost to the end before the timer reaches zero.', 'https://cdn.akamai.steamstatic.com/steam/apps/1316310/header.jpg?t=1608635010'),
(1318240, 'Shields of Loyalty', 'Mar 18, 2021', 17.99, 'Command an army of various unit types and classes through a hostile island world. Experience tactically challenging turn-based strategy action and train your army to become powerful followers. Meet a dark and possessed enemy and fight fervently until the snakes head is at your feet!', 'https://cdn.akamai.steamstatic.com/steam/apps/1318240/header.jpg?t=1658494005'),
(1318870, 'Turkey Hunting Unlimited', 'May 29, 2020', 1.99, 'Get ready to hit the Spring time woods and Hunt Turkey! The Gobblers are out there and depending on the difficulty level you choose it can be a Gobble Fest or a more realistic hunt! Hunt four states: New York, Ohio, Kansas, and Texas! Hunt with a Gun or a Bow!', 'https://cdn.akamai.steamstatic.com/steam/apps/1318870/header.jpg?t=1590771078'),
(1330390, 'Strike The Striker Z', 'Jan 19, 2021', 9.99, 'You can play with a Gamepad ! Strike The Striker Z is a third-person shooter game with platform phases. Use guns and super-powers to help him He can also unleash breath-taking super-attacks by opening fire on the Strikers. Bonus stages and Bosses also form part of this incredible adventure', 'https://cdn.akamai.steamstatic.com/steam/apps/1330390/header.jpg?t=1629842937'),
(1345030, 'Bomber Games', 'Dec 8, 2020', 7.99, 'Bomber Games is a fun arcade game for up to 8 players. Do you like to EXPLODE your friends, laugh together in a couch? Battle in arenas and explode them in this bomberman-inspired game with unseen bomb types and original abilities. Want more? Create and share your own levels. BOOM!', 'https://cdn.akamai.steamstatic.com/steam/apps/1345030/header.jpg?t=1607432771'),
(1359020, 'Vermitron', 'Jan 23, 2021', 7.99, 'Theyre Coming! Get ready to defend your lovely Flower from invading insect! Prepare your Bug Spray, Call your Holo-Pet, Fortify base and dont forget your mission: Find the Watering-Can!', 'https://cdn.akamai.steamstatic.com/steam/apps/1359020/header.jpg?t=1611420307'),
(1362270, 'ALPHA CENTAURI SPACE FORCE', 'Apr 8, 2021', 9.99, 'Execute intense space battle operations from side, and top view. Face tough enemies along your way, destroy guardians and generators. Dodge traps. Keep focus on targets. Think fast. Overcome the chaos. Join now and become an alpha centauri pilot. Bonus: retro like endless space shooter mini game.', 'https://cdn.akamai.steamstatic.com/steam/apps/1362270/header.jpg?t=1629075771'),
(1400620, 'Ballsy! World Cup 2020', 'Oct 28, 2020', 2.99, 'The fluent retro ballgame experience you didnt even know you were yearning for', 'https://cdn.akamai.steamstatic.com/steam/apps/1400620/header.jpg?t=1641123726'),
(1408050, 'Our Hero! Two', 'Oct 29, 2021', 1.99, '[2 of 3 games] Play in the shoes of three different heroes, each one with different abilities and strengths, to pave your way through this new funny adventure of the Our Hero! saga!', 'https://cdn.akamai.steamstatic.com/steam/apps/1408050/header.jpg?t=1657267178'),
(1416760, 'B.ARK', 'Jul 29, 2021', 9.99, 'Help a heroic team of pets in mechs take back Earth in this exciting Saturday Morning Cartoon inspired shoot em up for both new and hardcore players.', 'https://cdn.akamai.steamstatic.com/steam/apps/1416760/header.jpg?t=1627595627'),
(1432910, 'Godlike Burger', 'Apr 21, 2022', 11.99, 'In Godlike Burger you run the craziest restaurant of the galaxy! Stun, poison and kill customers in many devious waysâ€¦ and turn them into burger meat! And dont worry: Alien customers will keep coming if you are smart about it, because cannibalism is just too damn tasty.', 'https://cdn.akamai.steamstatic.com/steam/apps/1432910/header.jpg?t=1651857439'),
(1448070, 'KosmoSquad', 'Nov 10, 2020', 3.99, 'KosmoSquad is a twin-stick arena shooter where you survive as long as you can against an ever-increasing hoard of enemies. Fight alone or with up to three friends and collect star multipliers to maximize your high score. Use your score points to purchase upgrades for your ship and try again!', 'https://cdn.akamai.steamstatic.com/steam/apps/1448070/header.jpg?t=1605029685'),
(1505680, 'BAND OF BROTHERS', 'Jan 15, 2021', 0.99, 'BAND OF BROTHERS is a fast-paced action shooter! Various maps, many types of weapons, different modes are waiting for you in which teams will come together in a battle for victory.', 'https://cdn.akamai.steamstatic.com/steam/apps/1505680/header.jpg?t=1610730187'),
(1508860, 'Minforiga', 'Jan 21, 2021', 0.9, 'Minesweeper with a character! Dig down to the center of the earth and mend the core crystal before its too late.', 'https://cdn.akamai.steamstatic.com/steam/apps/1508860/header.jpg?t=1611271495'),
(1542990, 'Airplane shooting spree', 'Mar 9, 2021', 4.99, 'A black-and-white imitation of the nostalgic game, using the mouse to slide, avoid, attack, and constantly improve their firepower, in the dense enemy adhere to the last bar!', 'https://cdn.akamai.steamstatic.com/steam/apps/1542990/header.jpg?t=1615336261'),
(1551820, 'Twin Mind: Murderous Jealousy Collectors Edit', 'Mar 22, 2021', 6.99, 'Go on a new exciting adventure following a story of two twin investigators! Complete puzzles, solve riddles and demonstrate your intelligence to discover all the secrets that are hidden in this mysterious case.', 'https://cdn.akamai.steamstatic.com/steam/apps/1551820/header.jpg?t=1652947126'),
(1583630, 'Treasure of Barracuda', 'Aug 23, 2021', 0, 'A Point &amp; Click Puzzle Adventure, exploring the Treasure of Barracuda, a real brick built puzzle box. Solve the riddle using your old grandfathers amulet and find the treasures within! Fully buildable and functional in real life as well!', 'https://cdn.akamai.steamstatic.com/steam/apps/1583630/header.jpg?t=1629962681'),
(1608250, 'Soralio: Cooperation mystery solving game', 'May 7, 2021', 5.99, 'Sora and Rio are brought to a mysterious house. Lets solve the mystery and escape by talking. Communication is the key.', 'https://cdn.akamai.steamstatic.com/steam/apps/1608250/header.jpg?t=1623520269'),
(1646050, 'Wilford', 'Jun 15, 2021', 0, 'A top-down retro action game', 'https://cdn.akamai.steamstatic.com/steam/apps/1646050/header.jpg?t=1654926673'),
(1688470, 'Rat Prison', 'Jul 22, 2021', 9.99, 'Rat Prison - pixel 2D simulator with horror elements.', 'https://cdn.akamai.steamstatic.com/steam/apps/1688470/header.jpg?t=1626950773'),
(1691830, 'Temple with traps', 'Sep 6, 2021', 9.99, 'Find the objects that are hidden on the map.', 'https://cdn.akamai.steamstatic.com/steam/apps/1691830/header.jpg?t=1645499926'),
(1693130, 'Lucky Joe', 'Sep 6, 2021', 8.99, ' Do You Like Dying ? Lucky Joe is a unique action game that combines shooting and platforming in 60 large 2D levels. Core gameplay easy to learn but hard to master, intense gunfights, a touch of humor, tons of enemies, a bit of reflection, great sound tracksâ€¦ Try, die and retry...', 'https://cdn.akamai.steamstatic.com/steam/apps/1693130/header.jpg?t=1641644607'),
(1698400, 'A Day In Space', 'Aug 23, 2021', 5.99, 'In this short, first-person, interactive, exploration game, youll live a day on board of a space colony in 2040. Carry out your daily tasks, get to know your fellow colonisers and gather the clues to unravel the staggering truth behind your crewmates deaths.', 'https://cdn.akamai.steamstatic.com/steam/apps/1698400/header.jpg?t=1629734567'),
(1702170, 'epic maze', 'Nov 10, 2021', 39.99, 'epic maze is a third-person shooter game in which you must find your way to the gramophone in a procedurally generated 3d maze by following its music, turn it off, and then return. remember your path, do not get lost in maze. Original new concept. One of a kind. Replayable custom game.', 'https://cdn.akamai.steamstatic.com/steam/apps/1702170/header.jpg?t=1649103147'),
(1749090, 'Early Quest 2', 'Oct 24, 2021', 4.99, 'Join Weiry, one of the protagonists of Early Quest, on her new adventure in a magical world ...', 'https://cdn.akamai.steamstatic.com/steam/apps/1749090/header.jpg?t=1649486640'),
(1774100, 'Pet idle', 'Dec 9, 2021', 0, 'Pet Idle is a simulation game where you can take care of various virtual animals! Build and manage your home to be a cozy home for many pets!', 'https://cdn.akamai.steamstatic.com/steam/apps/1774100/header.jpg?t=1640284448'),
(1781270, 'Deja-vu VR', 'Dec 29, 2021', 0, 'In the city of Evia several residents are infected with light. A girl discovers what appears to be the host. It befriends it, feeds it and houses it. Not to the delight of the other residents. They want to drive the landlord away. A persecution begins ...', 'https://cdn.akamai.steamstatic.com/steam/apps/1781270/header.jpg?t=1640778804'),
(1781750, 'Fly Dangerous', 'May 24, 2022', 0, 'Extremely high skill-ceiling 6dof flight racing in a variety of environments with leaderboards, multiplayer and VR support', 'https://cdn.akamai.steamstatic.com/steam/apps/1781750/header.jpg?t=1653400529'),
(1784780, 'Hero of the Kingdom: The Lost Tales 2', 'Nov 19, 2021', 6.99, 'You, the princess, are having a small adventure outside the city walls. Meanwhile, the city is in flames, due to the attack of unknown monsters. You cant lie idle. You must save your people, gain allies to fight by your side against evil and become a heroic princess.', 'https://cdn.akamai.steamstatic.com/steam/apps/1784780/header.jpg?t=1637338565'),
(1857690, 'Retrievable', 'Jan 14, 2022', 5.99, 'An important emerald was stolen and has to be retrieved. Retrievable is an exploration game.', 'https://cdn.akamai.steamstatic.com/steam/apps/1857690/header.jpg?t=1644822668'),
(1903330, 'The Giant of Torridge Island', 'Apr 11, 2022', 5.99, 'Help or hinder Torridge Island as you take control of a Giant in this sandbox of villagers, wildlife and natural disasters. Will the villagers praise you and beg for your return in the morning, or pray that you never reappear.', 'https://cdn.akamai.steamstatic.com/steam/apps/1903330/header.jpg?t=1657652754'),
(1993520, 'Seasons', 'May 31, 2022', 0.99, 'A precision platformer that each season introduces new mechanics and new challenges, in a beautiful and dangerous world, are you ready?', 'https://cdn.akamai.steamstatic.com/steam/apps/1993520/header.jpg?t=1654009303'),
(2075820, 'Controller Sync', 'Jul 21, 2022', 0.99, 'Arcade multiplayer game Ideal for practicing controller skills', 'https://cdn.akamai.steamstatic.com/steam/apps/2075820/header.jpg?t=1658389783'),
(2076000, 'Bob: A thousand lives', 'Jul 21, 2022', 11.99, 'Discover Bobs variable and unique world, get to know his story and support him to reach his goal which is non other than finding his ultimate peace. Be a part of the cycle in which death and reborning are present countless times almost at the same time.', 'https://cdn.akamai.steamstatic.com/steam/apps/2076000/header.jpg?t=1658424945');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `favorito`
--
ALTER TABLE `favorito`
  ADD PRIMARY KEY (`id_usuario`,`id_videojuego`),
  ADD KEY `favFK` (`id_videojuego`);

--
-- Indices de la tabla `videojuego`
--
ALTER TABLE `videojuego`
  ADD PRIMARY KEY (`identificador`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `favorito`
--
ALTER TABLE `favorito`
  ADD CONSTRAINT `favFK` FOREIGN KEY (`id_videojuego`) REFERENCES `videojuego` (`identificador`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
