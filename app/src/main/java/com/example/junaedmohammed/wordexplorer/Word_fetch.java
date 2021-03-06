
package com.example.junaedmohammed.wordexplorer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Junaed Mohammed on 02-Feb-18.
 */


public class Word_fetch extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dictionary";
    private static final String TABLE_NAME = "word_table";

    private static final String TAB_id = "id";
    private static final String TAB_word = "word";
    private static final String TAB_meaning = "meaning";
    private static final String TAB_synonym = "synonym";
    private static final String TAB_antonym = "antonym";
    private static final String TAB_example = "example";

    private static final String TABLE_NAME_HIS = "history_table";
    private static final String TAB_his = "history_data";

    private static final String TABLE_NAME_FAV = "favorite_table";
    private static final String TAB_fav ="favorite_data";

    Word_fetch(Context c) {
        super(c, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String s = "CREATE TABLE " + TABLE_NAME + " ( " + TAB_id + " INTEGER PRIMARY KEY, " + TAB_word + " TEXT, " + TAB_meaning + " TEXT, "
                + TAB_synonym + " TEXT, " + TAB_antonym + " TEXT, " + TAB_example + " TEXT )";

        String s1 = "CREATE TABLE " + TABLE_NAME_HIS + " ( " + TAB_id + " INTEGER PRIMARY KEY, " + TAB_his + " TEXT )";


        String s2 = "CREATE TABLE "+TABLE_NAME_FAV+" ( "+TAB_id+" INTEGER PRIMARY KEY, "+TAB_fav+" TEXT )";

        sqLiteDatabase.execSQL(s);
        sqLiteDatabase.execSQL(s1);
        sqLiteDatabase.execSQL(s2);

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insetItems() {

        SQLiteDatabase database = this.getReadableDatabase();

        // how many rows in a sqlite database

        insertIntoTable(
                new WordModel(1, "Abdication", "????????????????????? ?????????", "kidnap, carry off, seize, capture", "Maintain", "It has been alleged that the person who attempted to abduct the girl was a serving member of the force."));

        insertIntoTable(
                new WordModel(2, "Abandon", "?????????????????? ?????????", "abandon, discontinue, discard, overboard", "Restraint", "her natural mother had abandoned her at an early age")
        );


        insertIntoTable(
                new WordModel(3,"Account","???????????????", "account, calculation, estimate, score", "Worthlessness", "You must pay at least ??1, 000 a month into the Moneyback account to qualify")
        );

        insertIntoTable(
                new WordModel(4,"Accumulate","??????????????????????????? ?????????", "gather, collect, assemble, amass", "Decrease", "Their pay increases as they accumulate experience and develop skills")
        );

        insertIntoTable(
                new WordModel(5,"Adjacency","??????????????????", "adjacency, proximity, nearness, extremity", "Remoteness", "The other problems we faced were that the houses are made out of wood and they are in close adjacent to each other.")
        );

        insertIntoTable(
                new WordModel(6,"Administer","?????????????????? ?????????", "administer, control, take the chair", "Misallocate", "I volunteer to administer the punishment,??? she announced, raising her hand.")
        );

        insertIntoTable(
                new WordModel(7,"Adventure","??????:?????????????????? ?????????", "campaign, adventure, adventuresome exploration", "Sure thing", "This was what I had always dreamed of, true excitement and adventure ")
        );

        insertIntoTable(
                new WordModel(8,"Aerolite","???????????????????????????", "meteorite, meteor, fireball, shooting star", "", "Followed by Japan and U.S.A, China holds most Antarctic aerolites")
        );

        insertIntoTable(
                new WordModel(9,"Affair","???????????????????????????", "matter, thing, affair, affairs, phenomenon", "Bobble", "his wife is having an affair")
        );

        insertIntoTable(
                new WordModel(10,"Affection","???????????????", "affection, fondness, love, feeling", "Animosity", "She felt affection for the wise old lady")
        );

        insertIntoTable(
                new WordModel(11,"Against","????????????????????????", "against, in opposition to, teeth, versus", "For, Pro", "the benefits must be weighed against the costs")
        );

        insertIntoTable(
                new WordModel(12,"Agree","????????????", "agree, obey, heed, believe in", "Conflict", "your body language does not agree with what you are saying")
        );

        insertIntoTable(
                new WordModel(13,"Ahead","??????????????????", "ago, ahead, Ere", "Afterward", "They are worlds ahead in price, quality and overall value.")
        );

        insertIntoTable(
                new WordModel(14,"Aim","??????????????????", "destination, target, goal, object", "Way", "his aim was perfect, and the guard's body collapsed backward")
        );

        insertIntoTable(
                new WordModel(15,"Alack","???????????????", "alack, woe is me", " Glory", "Alas and alack,I still owe LeeAnn a drink and a chat.")
        );

        insertIntoTable(
                new WordModel(16,"Alike","?????????????????????", "duplicate, alike, like, akin, similar", "Unlike", "In theory people became more alike and in many ways the world became much fairer")
        );

        insertIntoTable(
                new WordModel(17,"Alight","??????????????? ?????????", "get out of, descend, go down, get down", "Blackened", "Everything was in shambles, set alight with fire and misted by smoke.")
        );

        insertIntoTable(
                new WordModel(18,"Aliment","???????????????", "food, sustenance, meat, rations", "Trash", "Liberty is to faction what air is to fire, an aliment without which it instantly expires.")
        );

        insertIntoTable(
                new WordModel(19,"Ambient","???????????????????????????????????????", "environment, atmosphere, climate", "", "the liquid is stored at below ambient temperature")
        );

        insertIntoTable(
                new WordModel(20,"Amity","????????????????????????", "goodwill, benevolence, brotherhood", "venom", "international amity and goodwill")
        );

        insertIntoTable(
                new WordModel(21,"Ancient","?????????????????????", "ancient, old, archaic, primitive, venerable", "young, youthful", "the ancient civilizations of the Mediterranean")
        );

        insertIntoTable(
                new WordModel(22,"Amenity","?????????????????????", "civility, attention, courtesy, formality", "necessity, requirement", "heating is regarded as a basic amenity")
        );

        insertIntoTable(
                new WordModel(23,"Amerce","??????????????????????????? ?????????????????? ?????????", "fine, mulct, amerce, assess, estreat", "Unbearably", "It raises dust, separating fines from aggregate")
        );

        insertIntoTable(
                new WordModel(24,"Analogical","?????????????????????????????????", "duplicate, alike, like, akin, similar, analogical", "Unlike", "we have some analogical hints for beginners in this section")
        );

        insertIntoTable(
                new WordModel(25,"Anxiety","??????????????????", "concern, worry, anxiety, disquiet", "calm, calmness, content", "the housekeeper's eager anxiety to please")
        );

        insertIntoTable(
                new WordModel(26,"Apart","???????????????", "apart, separately, aloof, severally, differently", "together", "he leapt out of the car just before it was blown apart")
        );

        insertIntoTable(
                new WordModel(27,"Apostacy","???????????????????????????", "defection, renunciation", "perfect", "Any verbal denial of any principle of Muslim belief is considered apostasy")
        );

        insertIntoTable(
                new WordModel(28,"Annex","????????????????????? ?????????", "adjunct, sequence, annexe, annex", "decrement", "the first ten amendments were annexed to the Constitution in 1791")
        );

        insertIntoTable(
                new WordModel(29,"Append","??????????????? ?????????", "connect, append, join, engage, continue", "separate", "the results of the survey are appended to this chapter")
        );

        insertIntoTable(
                new WordModel(30,"Approve","????????????????????? ?????????", "assert, show, test, approve", "disapprove, negative", "the budget was approved by Congress")

        );

        insertIntoTable(
                new WordModel(31,"Appertain","???????????????????????????????????? ?????????????????????", "follow, agree, appertain", "tire, weary", "the answers generally appertain to improvements in standards of service")

        );

        insertIntoTable(
                new WordModel(32,"Arduous","???????????????????????????", "strenuous, laborious, tough, workaday", "soft, undemanding", "Michael's task is an arduous one, but critical to the well-being of 2.5m people")

        );

        insertIntoTable(
                new WordModel(33,"Argument","??????????????????", "reasoning, contention, cause, thought", "aftereffect, aftermath", "there is a strong argument for submitting a formal appeal")

        );

        insertIntoTable(
                new WordModel(34,"Arrest","????????????????????????", "binding, nabbing, catch, apprehension", "discharge", "I have a warrant for your arrest")
        );

        insertIntoTable(
                new WordModel(35,"Article","?????????????????????", "discharge, touch off, mark, brand", "", "his discharge from the hospita")

        );

        insertIntoTable(
                new WordModel(36,"Asexual","????????????", "ravishment, rape, violation", "nonsexual", "I mean, he's definitely not trying to be asexual")

        );

        insertIntoTable(
                new WordModel(37,"Attractive","???????????????????????????", "catching, enchanting, fascinating, winsome", "revolting, unalluring", "world travel has always been very attractive to me")

        );

        insertIntoTable(
                new WordModel(38,"Authority","????????????????????????", "domination, dominion, mastery, influence", "inexpert, nonexpert", "he had absolute authority over his subordinates")

        );

        insertIntoTable(
                new WordModel(39,"Average","?????????", "genuflexion, genuflection, fort", "strange, unusual", "the housing prices there are twice the national average")

        );

        insertIntoTable(
                new WordModel(40,"Away","????????????", " off, from here, from there; aside", "nearby, nigh", "tomorrow night's away game at Yankee Stadium")

        );

        insertIntoTable(
                new WordModel(41,"Balance","????????????????????????", "balance, symmetry, equipoise, poise", "nonequilibrium, unbalance", "slipping in the mud but keeping their balance")
        );

        insertIntoTable(
                new WordModel(42,"Bad","???????????????", "bad, evil, wicked, worsened, ill, poorly", "acceptable, adequate", "He had the disgruntled air of a writer whinging over a bad review")
        );

        insertIntoTable(
                new WordModel(43,"Banish","???????????????", "banish, expel, drive away", " receive, take, take in", "they were banished to Siberia for political crimes")
        );

        insertIntoTable(
                new WordModel(44,"Base","??????????????????", "ground, grounding, cornerstone", "venerable, virtuous", "the electorate's baser instincts of greed and selfishness")
        );

        insertIntoTable(
                new WordModel(45,"Bascket","???????????????", "wicker tray, container, repository", "", "Put two good rebounders close to the basket and designate one player to box out the shooter")
        );

        insertIntoTable(
                new WordModel(46,"Barter","?????????????????????", "trade, swop, swap", "", "he often bartered a meal for drawings")
        );

        insertIntoTable(
                new WordModel(47,"Battle","???????????????", "fighting, combat, campaign", "truce", "he has been battling against the illness")
        );

        insertIntoTable(
                new WordModel(48,"Bearable","??????????????????", "moderate, tolerable, bearable, endurable", "unendurable, unsupportable", "the pain from a sprained ankle is annoying but bearable")
        );


        insertIntoTable(
                new WordModel(49,"Beat","?????????????????? ?????????", "beat, swish, flog, batter", "unwearied", "the glissando begins on the second beat")
        );

        insertIntoTable(
                new WordModel(50,"Beautiful","??????????????????", "handsome, knockout, likely, lovely", "unpretty, unsightly", "Fabian felt furious at Tamora for being so cruel on someone so young and beautiful")
        );

        insertIntoTable(
                new WordModel(51,"Beck","??????????????????", "beacon, sign, beck, pointing", "", "It would be excellent if we could find more money to clean this beck, he said.")
        );

        insertIntoTable(
                new WordModel(52,"Beg","??????????????????????????? ?????????", "crave, seek, ask, petition", "console, content, quiet", "I begged him for mercy")
        );

        insertIntoTable(
                new WordModel(53,"Begin","???????????? ?????????", "start, begin, commence", "conclude, end, finish, terminate", "theorists have just begun to address these complex questions")
        );

        insertIntoTable(
                new WordModel(54,"Behind","???????????????", "latish, overdue, tardy", "early, inopportune", "as I looked behind, my feet crashed into a basket")
        );

        insertIntoTable(
                new WordModel(55,"Belief","?????????????????????", "confidence, conviction, credit", "nonbelief, unbelief", "his belief in the value of hard work")
        );

        insertIntoTable(
                new WordModel(56,"Beyond","????????? ????????????", "beyond, far, wide", "fewer, less", "he pointed to a spot beyond the trees"));

        insertIntoTable(
                new WordModel(57,"Born","?????????????????????????????????", "elemental, elementary, essential", "nonnatural", "he was born in Seattle"));

        insertIntoTable(
                new WordModel(58,"Bet","????????????", "betting, stake, feat, legerdemain", "rejectee", "every Saturday she had a bet on the horses")
        );

        insertIntoTable(
                new WordModel(59,"Bird","????????????", "fowl, spoke, daw, blind", "cheer", "I'm a pretty tough old bird")
        );

        insertIntoTable(
                new WordModel(60,"Bestial","????????????", "brutal, beastly, animal, doggish", "high-minded, lofty, lordly", "Darwin's revelations about our bestial beginnings"));

        insertIntoTable(
                new WordModel(61,"Calculate","???????????? ?????????", "singe, bind, work out", "calibrate, measure, scale", "his last words were calculated to wound her"));

        insertIntoTable(
                new WordModel(62,"Capacity","??????????????????????????????", "capacity, retention, receptivity", "compute, work out", "I was impressed by her capacity for hard work"));

        insertIntoTable(
                new WordModel(63,"Capital","?????????????????????", " metropolis, headquarters", "last, least", "That's splendid! Capital")
        );

        insertIntoTable(
                new WordModel(64,"Career","????????????", "walks of life, trade, vocation", "creep, poke", "e me to make an offer")
        );

        insertIntoTable(
                new WordModel(65,"Cave","????????????", "cavern, grotto, hole, hollow", "creep, poke", "This produces stalactites and related deposits in underground caves")
        );

        insertIntoTable(
                new WordModel(66,"Celebrate","??????????????????", "celebrate, dignify, Flatter", "transgress, violate", "they were celebrating their wedding anniversary at a restaurant")
        );

        insertIntoTable(
                new WordModel(67,"Chair","??????????????????", "Chair, deck chair", "ranks", "a three-year term as the board???s deputy chair")
        );

        insertIntoTable(
                new WordModel(68,"Charm","?????????", "talisman, spell, receipt", "hoodoo, jinx", "he was captivated by her youthful charm")
        );

        insertIntoTable(
                new WordModel(69,"Climber","?????????", "creeper, twiner, creepy plant", "", "leopards are great tree climbers")
        );

        insertIntoTable(
                new WordModel(70,"Close","??????????????????", "intimate, near, familiar, thick", "opposite, other, that", "they stood close to the door")
        );

        insertIntoTable(
                new WordModel(71,"Cloud","?????????", "year, rain, cloud, shower", "", "the sun had disappeared behind a cloud")
        );

        insertIntoTable(
                new WordModel(72,"Collect","?????????????????? ?????????", "glean, draw together, collect, gather", "dissipate, scatter", "he went around the office collecting old coffee cups")
        );

        insertIntoTable(
                new WordModel(73,"Combat","???????????????", "fighting, combat, campaign", "truce", "fighting between armed forces")
        );

        insertIntoTable(
                new WordModel(74,"Combination","??????????????????", "summation, alternative, multitude", "ingredient", "a combination of blackberries, raspberries, and rhubarb")
        );

        insertIntoTable(
                new WordModel(75,"Comence","???????????????", "enter, commence, enter upon", "keep, retain", "his design team commenced work")
        );

        insertIntoTable(
                new WordModel(76,"Comparison","???????????????", "analogy, balance, parallelism", "nonpayment", "they drew a comparison between Gandhi's teaching and that of other teachers")
        );

        insertIntoTable(
                new WordModel(77,"Conceit","??????????????????", "egoism, vanity, self-conceit", "bobble", "he was puffed up with conceit")
        );

        insertIntoTable(
                new WordModel(78,"Concern","??????????????????", "disquiet, concernment, care", "unconcern", "such unsatisfactory work gives cause for concern")
        );

        insertIntoTable(
                new WordModel(79,"Constriction","????????????????????????", "contraction, cramp, obstruction", "decompression, expansion", "asthma is a constriction of the airways")
        );

        insertIntoTable(
                new WordModel(80,"Creature","?????????", "life, thing, embodied soul", "brute, critter", "night sounds of birds and other creatures")
        );

        insertIntoTable(
                new WordModel(81,"Curious","??????????????????", "weird, odd, kinky, peculiar", "incurious, uncurious", "I began to be curious about the whereabouts of the bride and groom")
        );

        insertIntoTable(
                new WordModel(82,"Dangerous","????????????????????????", "perilous, breakneck, adventurous", " safe, unthreatening", "Her life is in danger now")
        );

        insertIntoTable(
                new WordModel(83,"Dark","?????????????????????", "dimmed, dusk, dusky", "lucid, luminous", "it's too dark to see much")
        );

        insertIntoTable(
                new WordModel(84,"Death","?????????", "expiry, departure, mortality", "birth, nativity", "I don't believe in life after death")
        );

        insertIntoTable(
                new WordModel(85,"Deception","????????????????????????", "robbery, cheat, Flimflam", "ingenuousness, sincerity", "obtaining property by deception")
        );

        insertIntoTable(
                new WordModel(86,"Defection","?????????????????????", "defection, leaving one's party", "impeccable, perfect", "his defection from the Republican Party")
        );

        insertIntoTable(
                new WordModel(87,"Deem","????????????????????? ?????????", " hold, imagine, judge", " discredit, reject", "the event was deemed a great success")
        );

        insertIntoTable(
                new WordModel(88,"Demolish","??????????????? ?????????", "dismantle, demolish, pound, pulverize", "rear, set up", "terrorists used a powerful pipe bomb to demolish the concrete wall around the compound")
        );

        insertIntoTable(
                new WordModel(89,"Demon","???????????????", " genie, prodigy, Goliath", "angel", "a man who was finally able to conquer his demons and kick his drug habit")
        );

        insertIntoTable(
                new WordModel(90,"Depression","????????????????????????", "dejection, dumps", "boom", "the depression of prices")
        );

        insertIntoTable(
                new WordModel(91,"Desert","?????????????????????", "steppe, desert, plain", "fertile, fruitful", "overgrazing has created desert conditions")
        );

        insertIntoTable(
                new WordModel(92,"Destiny","??????????????????", "fortune, destiny, lot, chance", "birth, nativity", "she was unable to control her own destiny")
        );

        insertIntoTable(
                new WordModel(93,"Detest","???????????? ?????????", "despise, look down on, nauseate", "love", "of all birds the carrion crow is the most detested by gamekeepers")
        );

        insertIntoTable(
                new WordModel(94,"Devoid","??????????????????", "disowned, abandoned, cast-off", "replete, rife", "Lisa kept her voice devoid of emotion")
        );

        insertIntoTable(
                new WordModel(95,"Diminish","?????????", " diminish, reduce, knock off", "magnify, praise", "a tax whose purpose is to diminish spending")
        );

        insertIntoTable(
                new WordModel(96,"Domain","???????????????", "realm, reign, dominion, domain", "vacation", "the southwestern French domains of the Plantagenets")
        );

        insertIntoTable(
                new WordModel(97,"Dry","???????????????", "uninteresting, parched, husky, dull", " moist, wet", "the jacket kept me warm and dry")
        );

        insertIntoTable(
                new WordModel(98,"Dull","?????????????????????", " tame, faint, feeble, lifeless", "sharpened, whetted", "your diet doesn't have to be dull and boring")
        );

        insertIntoTable(
                new WordModel(99,"Drowsy","????????????????????????", "sleepy, drowsy, somnolent", "wakeful, wide-awake", "the wine had made her drowsy")
        );

        insertIntoTable(
                new WordModel(100,"Duty","????????????????????????", "assignment, function, labor", " preference,", "it's my duty to uphold the law")
        );
        insertIntoTable(
                new WordModel(101,"Ear","?????????", "Ear, oto", " unawareness", "Plants were allowed to open-pollinate and all measurements were taken on plants with a fertilized ear")
        );

        insertIntoTable(
                new WordModel(102,"Earth","??????????????????", " Earth, world, globe, terra, universe", "mite, peanuts", "the diversity of life on earth")
        );

        insertIntoTable(
                new WordModel(103,"Element","??????????????????", "element, stuff, component, ingredient", "whole", "the death had all the elements of a great tabloid story")
        );

        insertIntoTable(
                new WordModel(104,"Elimination","???????????????", "omission, reliquishment, repudiation", "duskiness", "in that clime the elimination of the full moon is such as you can practically read by it")
        );

        insertIntoTable(
                new WordModel(105,"Eligible","?????????????????????", "applicable, apposite, correct, Eligible", "Unlike", "customers who are eligible for discounts")
        );

        insertIntoTable(
                new WordModel(106,"Emanate","??????:????????? ?????????????????????", "Emanate, Emerge, Emergence, Issue", "street-smart, streetwise", "warmth emanated from the fireplace")
        );

        insertIntoTable(
                new WordModel(107,"Apart","???????????????", "apart, separately, aloof, severally, differently", "absorb, inhale", "he leapt out of the car just before it was blown apart")
        );

        insertIntoTable(
                new WordModel(108,"Emotion","????????????", "feeling, passion, sentiment", "insensitivity, unfeelingness", "she was attempting to control her emotions")
        );

        insertIntoTable(
                new WordModel(109,"Endow","?????????????????? ?????????????????? ????????????????????? ?????????", " favor, gift, invest", "defund, disendow", "he endowed the church with lands")
        );

        insertIntoTable(
                new WordModel(110,"Enjoy","??????????????? ?????????", "Enjoy, bask, dig, enjoy oneself", "abhor, abominate", "Joe enjoys reading Icelandic family sagas")
        );

        insertIntoTable(
                new WordModel(111,"Entire","???????????????", "unmitigated, undivided, unabridged", "divided, scattered", "my plans are to travel the entire world")

        );

        insertIntoTable(
                new WordModel(112,"Equal","????????????", "the same, equivalent, matching, even", "prejudiced, unjust", "add equal amounts of water and flour")

        );

        insertIntoTable(
                new WordModel(113,"Falsity","?????????????????? ?????????", " lie, fabrication, gag, untruth, falsity", "truth, verity", "he exposed the falsity of the claim")

        );

        insertIntoTable(
                new WordModel(114,"Famine","???????????????????????????", "scarcity of food, starvation, malnutrition", "sufficiency, wealth", "drought could result in famine throughout the region")

        );

        insertIntoTable(
                new WordModel(115,"Fare","???????????????", "toll, tariff, transport cost", "toxin, venom", "the party fared badly in the spring elections")

        );

        insertIntoTable(
                new WordModel(116,"Favour","????????????????????????", "light of one's countanance, tenderness", "estranged", "the legislation is viewed with favor")

        );

        insertIntoTable(
                new WordModel(117,"Fear","?????????", "Fear, alarm, angst", "take, tolerate", "drivers are threatening to quit their jobs in fear after a cabby's murder")

        );

        insertIntoTable(
                new WordModel(118,"Feign","?????? ?????????", "make belive, prestence, Fake, Feign", "disown, repudiate", "she feigned nervousness")

        );

        insertIntoTable(
                new WordModel(119,"Fire","????????????", "Fire, blaze, great fire, inferno", "insensitiveness, insensitivity", "a number of suspicious fires in the neighborhood recently")

        );

        insertIntoTable(
                new WordModel(120,"Firm","????????????", "consistent, Firm, Fixed, Immovable", "unconcern", "the bed should be reasonably firm, but not too hard")

        );

        insertIntoTable(
                new WordModel(121,"Galaxy","???????????????????????????", " Galaxy, Milky Way, Via Lactea", "stone's throw, striking distance", "There are reckoned to be about 400 billion stars in our galaxy , the Milky Way")

        );

        insertIntoTable(
                new WordModel(122,"Game","????????????", "pastime, amusement, trifling", "unamenable, unwilling", "they were game for anything after the traumas of Monday")
        );

        insertIntoTable(
                new WordModel(123,"Gas","???????????????", "Gas, breath, fume", "sluggishness, torpidity", "hot balls of gas that become stars")
        );

        insertIntoTable(
                new WordModel(124,"Gentle","????????????", "kindly, low-pitched, soften", " scathing, stern, ungentle", "a little gentle persuasion")
        );

        insertIntoTable(
                new WordModel(125,"Ghost","??????????????????????????????", "genie, spirit, mantle, turnskin", "angel", "the building is haunted by the ghost of a monk")
        );

        insertIntoTable(
                new WordModel(126,"Giant","???????????????", "demon, genie, prodigy, Goliath", "bantam, bitty", "giant multinational corporations")
        );

        insertIntoTable(
                new WordModel(127,"Gloom","???????????????", "sorrow, melancholia, dejection", "rapture, rapturousness", "he strained his eyes peering into the gloom")
        );

        insertIntoTable(
                new WordModel(128,"Grantor","????????????", "giver, grantor, benefactor", "opponent", "The grantee sued the grantor upon his covenant to maintain the road")
        );

        insertIntoTable(
                new WordModel(129,"Grave","?????????", "trance, burial, rapture, ecstasy", "light, unserious", "a matter of grave concern")
        );


        insertIntoTable(
                new WordModel(130,"Grime","?????????????????? ????????????", " filth, daub, soil, excrement", "light, unserious", "the beaches are grimed with a foul foam")
        );

        insertIntoTable(
                new WordModel(131,"Hard","????????????", "enacious, stubborn, ticklish", "cheap, easy", "stooping over all day was hard work")
        );

        insertIntoTable(
                new WordModel(132,"Hash","????????????", " collage, crazy quilt", "", "they went to the diner to hash out ideas")
        );

        insertIntoTable(
                new WordModel(133,"Heart","???????????????", "heart, bosom, breast", "pitilessness", "The device has a tube entering the left ventricle, the heart 's main pumping chamber.")
        );

        insertIntoTable(
                new WordModel(134,"Heavy","????????????", "massive, ponderous, weighty", "light, weightless", "this trunk full of books is much too heavy for one person to lift")
        );

        insertIntoTable(
                new WordModel(135,"Hell","???????????????????????????", "Pandemonium, perdition, Tophet", "bliss, elysian fields", "In that explanation, the hell realm was in the depths of the earth")
        );

        insertIntoTable(
                new WordModel(136,"Hide","???????????????", "leather, pelt, skin", "Show", "he hid the money in the house")
        );

        insertIntoTable(
                new WordModel(137,"History","??????????????????", "annals, chronicle, record", "present, today", "the history of Aegean painting")
                );

        insertIntoTable(
                new WordModel(138,"Holiday","??????????????? ?????????", "day off, fiesta, playday", "extension, prolongation", "he is holidaying in Italy")
        );

        insertIntoTable(
                new WordModel(139,"Honey","?????????", "honey, flower juice", "bust", "I was intrigued with how they gathered pollen and nectar from flowers to make honey")
        );

        insertIntoTable(
                new WordModel(140,"Humour","???????????????", "humor, makeup, disposition", "pathos", "she was always humoring him to prevent trouble")
        );

        insertIntoTable(
                new WordModel(141,"Hut","???????????????", "shebang, bothy, shanty", "", "a hutted encampment")
                );

        insertIntoTable(
                new WordModel(142,"Idea","???????????????", "view, Idea, Image, uptake", "paragon", "they don't think it's a very good idea")
        );

        insertIntoTable(
                new WordModel(143,"Idle","?????????", "Easy-going, truant, rotter, lymphatic", "active, alive", "assembly lines standing idle for lack of spare parts")
        );

        insertIntoTable(
                new WordModel(144,"Ignore","????????????????????? ?????????", " pass by, disregard, omit, overlook", "attend (to), heed", "he ignored her outraged question")
        );

        insertIntoTable(
                new WordModel(145,"Illiteracy","???????????????????????????", " unawareness, inexperience", "learning, literacy", "the ineffective educational system meant that illiteracy was widespread")
                  );

        insertIntoTable(
                new WordModel(146,"Imitate","?????????????????? ?????????", "play the ape, sham, transcription", "originate", "his style was imitated by many other writers")
        );

        insertIntoTable(
                new WordModel(147,"Immerse","???????????? ?????????", " submerge, dip, dunk", "drain", "she immersed herself in her work")
        );

        insertIntoTable(
                new WordModel(148,"Immoral","?????????", " wicked, evil, foul", "decent", "an immoral and unwinnable war")
        );

        insertIntoTable(
                new WordModel(149,"Inadequate","???????????????????????????", " plentiful, ample, superabundant", " enough, sufficient", "these labels prove to be wholly inadequate")
        );

        insertIntoTable(
                new WordModel(150,"Indiscriminate","?????????????????????????????????", "unjust, indiscriminate, blind", "homogeneous", "the indiscriminate killing of civilians")
        );

        insertIntoTable(
                new WordModel(151,"Interrupt","????????????????????? ???????????????", "put a stopper on, Interrupt, stop", "collide, conflict", "the buzzer interrupted his thoughts")
        );

        insertIntoTable(
                new WordModel(152,"Intoxicate","????????????????????? ?????????", "inebriate, Intoxicate", "depress", "We don't allow people into sessions if they are intoxicated by alcohol or drugs")
        );

        insertIntoTable(
                new WordModel(153,"Ireful","????????????????????????", "Irate, Ireful, moddy, shirty", "delighted, pleased", "ireful expressions on the faces of the protesters of the tax increase")
        );

        insertIntoTable(
                new WordModel(154,"Judge","??????????????????", "justice, beak, arbiter, syndic", "", "scientists were judged according to competence")
        );

        insertIntoTable(
                new WordModel(155,"Journey","??????????????????", "going, exodus, procession", "", "she went on a long journey")
        );

        insertIntoTable(
                new WordModel(156,"Joke","??????????????????", "prank, rig, guy, fun, quip", "darling, favorite", "she was in a mood to tell jokes")
        );

        insertIntoTable(
                new WordModel(157,"Joint","?????????", " linked, combined, associated, joint", "exclusive", "the companies issued a joint statement")
        );

        insertIntoTable(
                new WordModel(158,"Jolly","??????????????????", " strong, robust, jolly, pithy", "sluggish, torpid", "he was a jolly man full of jokes") );

        insertIntoTable(
                new WordModel(159,"Judas","????????????????????????????????? ?????????", "disquiet, concernment, care", "", "To his foes, he is a Judas who betrayed loyal friends.")
        );

        insertIntoTable(
                new WordModel(160,"Juvenile","??????????????????", "youngling, juvenile, adolescent, vernal", "adult, grown-up, mature", "throwing a tantrum is rather juvenile behavior for a person of your age")
        );

        insertIntoTable(
                new WordModel(161,"Keen","?????????????????????", "harsh, hot, sharp, cutting, acid", "balmy", "keen believers in the monetary system")
        );

        insertIntoTable(
                new WordModel(162,"Kingdom","???????????????", "area, arena, bailiwick, barony", "", "In its religious sense, kingdom is the spiritual reign or authority of God.")
        );

        insertIntoTable(
                new WordModel(163,"Knave","???????????????????????????", " evildoer, knave, blackguard", " angel, innocent", "he plays the role of the duplicitous knave who tries to foil the play's hero")
        );

        insertIntoTable(
                new WordModel(164,"Kiss","??????????????????", "kiss, caress, buss", "bang, bash, bump", "he kissed her on the lips")
        );

        insertIntoTable(
                new WordModel(165,"Knowledge","???????????????", "consciousness, learning, knowing", "illiteracy, illiterateness", "the program had been developed without his knowledge")
        );

        insertIntoTable(
                new WordModel(166,"Kismet","??????????????????", "fortune, destiny, lot, kismet", "", "what chance did I stand against kismet?")
        );

        insertIntoTable(
                new WordModel(167,"Kill","??????", "kill, slaughter, killing", "animate", "a lion has made a kill")
        );

        insertIntoTable(
                new WordModel(168,"Kick","??????????????????", " boot, punt", " willingness", "a kick in the head")
        );

        insertIntoTable(
                new WordModel(169,"Lad","????????????", "youngster, juvenlie, lad, yonker", "", "I read that book when I was a lad")
        );

        insertIntoTable(
                new WordModel(170,"Land","?????????", " ground, soil, base, floor", "", "the reptiles lay their eggs on land")
        );

        insertIntoTable(
                new WordModel(171,"Lax","???????????????", "remiss, unbound, slack", "attentive, careful", "lax security arrangements at the airport")
        );

        insertIntoTable(
                new WordModel(172,"Lay","????????????", "maintain, retain, set, place", "", "the lay of the surrounding countryside")
        );

        insertIntoTable(
                new WordModel(173,"Life","????????????", " existence, livelihood, breath, quick", "sluggishness, torpidity", "a disaster that claimed the lives of 266 Americans")
        );

        insertIntoTable(
                new WordModel(174,"Lift","?????????????????????", "rear, raise, elevate, uplift", "hindrance", "Miss Green is giving me a lift back to school")
        );

        insertIntoTable(
                new WordModel(175,"Love","?????????????????????", "affection, attachment, endearment, fancy", "abomination", "she was the love of his life")
        );

        insertIntoTable(
                new WordModel(176,"Loyal","????????????????????????", " following faithfully, well-affected", "disloyal, faithless", "he remained loyal to the government")
        );

        insertIntoTable(
                new WordModel(177,"Luminous","??????????????????", "light, dazzling, shiny, luminous", "dim, dull", "the luminous dial on his watch")
        );

        insertIntoTable(
                new WordModel(178,"Mad","????????????", "maniac, frenetic, berserk, moonstruck", " angerless", "he felt as if he were going mad")
        );

        insertIntoTable(
                new WordModel(179,"Maim","??????????????? ?????????", " mutilate, maim, hamble, scotch", "renew, repair, restore", "The last thing I needed was to be maimed by a wild animal two hours before my birthday.")
        );

        insertIntoTable(
                new WordModel(180,"Manor","?????????????????????", "having, estate, manor, real estate", "", "the right to mine ores within the manor of Little Langdale")
        );


        insertIntoTable(
                new WordModel(181,"Merit","?????????????????????", "competence, worth, worthiness", "deficiency", "composers of outstanding merit")
        );

        insertIntoTable(
                new WordModel(182,"Minister","?????????????????????", "adviser, cabinet member, queen", "layperson, secular", "her doctor was busy ministering to the injured")
        );

        insertIntoTable(
                new WordModel(183,"Misbehave","????????????????????? ?????????", " misuse, ill-treat, ill-use", "obey", "If children are misbehaving , then we should put fixed fines on their parents.")
        );

        insertIntoTable(
                new WordModel(184,"Motion","?????????", " movement, move, course", "motionlessness", "the laws of planetary motion")
        );

        insertIntoTable(
                new WordModel(185,"Mumble","?????????????????? ?????????", "mutter, mussitate, maunder", "", "Rosie had replied in a mumble")
        );

        insertIntoTable(
                new WordModel(186,"nab","????????????????????????", "catch, capture, apprehend, arrest, seize, grab", "release,let go ",
                        "The man falls in his own trap when cops set out to nab him."));



        insertIntoTable(
                new WordModel(187,"Nail","??????",
                        "talon, claw,clincher, bar", "",
                        "Let me finally nail the lie that service pensions are free"));


        insertIntoTable(
                new WordModel(188,"Naive","????????????????????????",
                        "simple, unaffected,innocent, guileless",
                        "aware,intelligent,sophisticated",
                        "Daisy is always seen wearing white, which gives her and innocent naive appearance")
        );
        insertIntoTable(
                new WordModel(189,"Narrow","?????????????????????",
                        "confined, parochial,strait, small",
                        "wide, broad, spacious",
                        "If a group leader's philosophy and beliefs are narrow and one-sided, then back away.")
        );
        insertIntoTable(
                new WordModel(190,"Nasty","???????????????",
                        "ugly, bad, unholy, dirty",
                        "agreeable,calm,delightful,easy",
                        "They could still do some quite nasty damage if people inadvertently handled them or were exposed to them.")
        );

        insertIntoTable(
                new WordModel(191,"Nature","??????????????????",
                        "temperament, behavior, mold, quality, habit",
                        "exterior,exteriority,outside",
                        "They vary in size and nature")
        );

        insertIntoTable(
                new WordModel(192,"Neglect","??????????????????",
                        "connivance, inattention, contempt, disdain",
                        "cherish, look after, care for",
                        "The majority of the houses obtained by private landlords were now exhibiting signs of neglect and dilapidation.")
        );



        insertIntoTable(
                new WordModel(193,"Nervous","???????????????????????????",
                        "active, industrious, hard-working",
                        "confident,cool,easy-going,extroverted",
                        "I eyed the folder in her hands with both nervous excitement and a little bit of foreboding.")
        );

        insertIntoTable(
                new WordModel(194,"Nimble","????????????",
                        "agile, lively, pragmatic",
                        "stiff, clumsy, lumbering",
                        "The boy jumped up onto his bed with nimble movement, holding the insulation in his mouth while rummaging the pouch in his hand for a normal wrench.")
        );

        insertIntoTable(
                new WordModel(195,"Notice","??????????????????????????????",
                        "observe, see, look at",
                        "overlook, ignore, disregard",
                        "I couldn't help but notice the realization that dawned on my father's face.")
        );

        insertIntoTable(
                new WordModel(196,"Nurture","???????????????????????????",
                        "fostering, rearing, upbringing",
                        "neglect, hinder",
                        "The church is the seedbed of gospel preachers, and we must value and nurture what God plants among us.")
        );
        insertIntoTable(
                new WordModel(197,"Nugatory","???????????????",
                        "vain, worthless, trashy",
                        "important, major",
                        "The threat was of course carried out in Iraq - with the nugatory results just mentioned.")
        );
        insertIntoTable(
                new WordModel(198,"Nominate","????????????????????? ?????????",
                        "propose, recommend, suggest, name",
                        "dethrone, displace, eject",
                        "That's why the President announced his intent to nominate Commissioner Kerik.")
        );
        insertIntoTable(
                new WordModel(199,"Nuclear","???????????????????????????",
                        "atomic, atomical",
                        "",
                        "The result might be a chain reaction: a self-sustaining release of nuclear energy.")
        );
        insertIntoTable(
                new WordModel(200,"Nocturnal","??????????????????",
                        "nighty, night-seeker",
                        "dilurnal",
                        "Hamsters are nocturnal although they are sometimes active during the day.")
                 );

        insertIntoTable(
                new WordModel(201,"New","????????????",
                        "fresh, modern, recent",
                        "familiar, hackneyed, old",
                        "In the meantime, a number of new measures have been introduced to increase police visibility.")
        );

        insertIntoTable(
                new WordModel(202,"Need", "????????????????????????",
                        "necessity, obligation, requirement, call, demand",
                        "excess, fill, overabundance",
                        "The reality is that many people are driven by an irrational need for speed.")
        );

        insertIntoTable(
                new WordModel(203,"Noise","??????????????????",
                        "cry, clop,scurry, outcry",
                        "quiet, silence, silentness",
                        "The door to the office shut out the noise in the hall outside; inside, it was quiet as a tomb.")
        );

        insertIntoTable(
                new WordModel(204,"Nonsense", "?????????????????????",
                        "rubbish, mischief, absurdity, nonsensicality, gimcrackery",
                        "reasonableness, sensibleness,levelheadedness",
                        "But what possesses them to write such nonsense with a straight face is beyond me.")
        );

        insertIntoTable(
                new WordModel(205,"Null","????????????",
                        "void, ineffective, invalid, impractical",
                        "useful, valuable, worthy",
                        "Poor exposure assessment, insofar as it is nondifferential, distorts the epidemiological measures of association toward the null value.")
        );

        insertIntoTable(
                new WordModel(206,"Oath","?????????",
                        "adjuration, obligation,promise, premise, proposition",
                        "not promised",
                        "They took an oath of allegiance to the king")
        );

        insertIntoTable(
                new WordModel(207,"Objection","??????????????????",
                        "protest, protestation, demur, demurral, demurrer, complaint, expostulation",
                        "willingness,approval, sanction,acceptance",
                        "Whilst we have no objection to competition, this one-sided battle is madness.")
        );
        insertIntoTable(
                new WordModel(208,"Obscure","?????????????????????",
                        "unclear, uncertain, unknown, in doubt,indeterminate, concealed, hidden",
                        "clear, definite, pellucid",
                        "He has a way of giving to some obscure magical belief or religious custom a sort of gripping immediacy.")
        );
        insertIntoTable(
                new WordModel(209,"Odour","????????????",
                        "smell, flavor, scent",
                        "fragrance,aroma,perfume",
                        "He could smell the familiar odour of rotting foliage in his nostrils.")
        );

        insertIntoTable(
                new WordModel(210,"Offense","???????????????",
                        "crime, illegal/unlawful act, misdemeanor,felony,wrongdoing,wrong",
                        "impeccability, innocence, irreproachability,goodness, morality, righteousness",
                        "It is more of a defense and offense attack combined.")
        );

        insertIntoTable(
                new WordModel(211,"Often","?????????????????????",
                        "frequently, many times, many a time,repeatedly, again and again",
                        "infrequently, little, rarely, seldom",
                        "The scenario could often start with one gang member simply being stared at by a rival.")
        );

        insertIntoTable(
                new WordModel(212,"Old","??????????????????",
                        "elderly, aged,advanced in years,ancient",
                        "fresh, vernal, young, youthful",
                        "Jim, as he was popularly known, belonged to an old and highly respected family in the district.")
        );

        insertIntoTable(
                new WordModel(213,"Onshore","??????????????? ????????????",
                        "landwards,longshore,inshore",
                        "amphibious,aquatic,offshore",
                        "Avoid bodies of water with persistent onshore wind, which concentrates the larvae in shallower areas.")
        );

        insertIntoTable(
                new WordModel(214,"Opportunity","???????????????",
                        "benefit, convenience, advantage, favor, avail",
                        "misfortune,difficulty,tragedy",
                        "It was an opportunity of a lifetime and I was really pleased to have the chance to meet him.")
        );

        insertIntoTable(
                new WordModel(215,"Opulent","?????????????????????????????????",
                        "luxurious, sumptuous, palatial, lavish",
                        "penniless,destitute,effete",
                        "Once the symbol of a rich legacy, they used to grace the opulent confines of sprawling traditional houses belonging to the aristocratic class.")
        );

        insertIntoTable(
                new WordModel(216,"Optimism","??????????????????",
                        "hopefulness, hope, confidence, buoyancy, cheer",
                        "pessimism,despair,apprehension",
                        "His early optimism was soon overshadowed by a radical doctrine of grace.")
        );

        insertIntoTable(
                new WordModel(217,"Orthodox","???????????????",
                        "conservative,traditional, observant,devout,strict",
                        "unconventional,irregular,free spirit",
                        "Our response is that the third party followed the orthodox practice, which was dry drilling in coal or soft strata and wet drilling in stone.")
        );
        insertIntoTable(
                new WordModel(218,"Ostensible","????????????????????????",
                        "apparent, outward, superficial, professed, supposed, alleged, purported",
                        "genuine,improbable,profound",
                        "The show confirmed that he is an unabashed landscape painter, regardless of his ostensible subject matter.")
        );
        insertIntoTable(
                new WordModel(219,"Other","????????????????????????",
                        "alternative, different, dissimilar, disparate, distinct, separate, contrasting",
                        "related,same,alike",
                        "Future generations will have to find some other way to rise up against their parents.")
        );
        insertIntoTable(
                new WordModel(220,"Outfit","????????????????????????",
                        "costume, suit, uniform, ensemble, attire, clothes, clothing, dress, garb, getup",
                        "unclothe,bare,abstain",
                        "The rest of his outfit consisted of black slacks, black boots, and black gloves.")
                  );

        insertIntoTable(
                new WordModel(221,"Overcome","??????????????????",
                        "defeat, beat, conquer, trounce, thrash, rout, vanquish, overwhelm",
                        "succumb,surrender,capitulate",
                        "Reason is easily overcome by emotion, but emotion can be apathetic or energetic.")
        );

        insertIntoTable(
                new WordModel(222,"Own","???????????????",
                        "personal, individual, particular, private, personalized, unique",
                        "deny,lack,disown",
                        "As a child, Ismat was inspired by her mother, who used to make her own clothes.")
        );

        insertIntoTable(
                new WordModel(223,"Obligate","?????????????????????????????????,???????????????????????????",
                        "compel,commit,bind,require,constrain,force,impel",
                        "free,absolve,request",
                        "Chlamydia are obligate intracellular parasites that are present in 2 forms.")
        );

        insertIntoTable(
                new WordModel(224,"Oust","?????????????????? ?????????,???????????????????????? ?????????",
                        "drive out, expel, force out, throw out, remove, eject, get rid of, depose",
                        "keep,retain,designate",
                        "One last push was required to oust him completely.")
        );

        insertIntoTable(
                new WordModel(225,"Pace","?????????,??????????????????",
                        "step, gait, speed, stride, yard, tempo, rate",
                        "hobble,amble,clumsiness",
                        "The ring road allows traffic to flow at a remarkably fast pace.")
        );

        insertIntoTable(
                new WordModel(226,"Pain","???????????????,?????????????????? ????????????????????????",
                        "suffering, agony, torture, torment, discomfort",
                        "comfort,delight,relief",
                        "I'd like to think he wouldn't have left us if he hadn't also been in physical pain.")
        );

        insertIntoTable(
                new WordModel(227,"Palace","?????????????????????,??????????????????????????????",
                        "royal/official residence, castle, chateau, mansion, stately home, schloss",
                        "hovel,shanty",
                        "The palace did bring entertainment to south east London but not generally for the masses.")
        );
        insertIntoTable(
                new WordModel(228,"Panic","???????????????,???????????????,??????????????????",
                        "alarm, anxiety, nervousness, fear, fright, trepidation, dread, terror",
                        "calmness,serenity",
                        "I felt the salt water in my throat,the fear,panic and dread.")
        );
        insertIntoTable(
                new WordModel(229,"Paradise","???????????????????????????????????????,??????????????????",
                        "bliss, heaven, ecstasy, delight, joy",
                        "abyss,hell,hades",
                        "His naivety was so deep that he was able to create a paradise of enchanted magic.")
        );
        insertIntoTable(
                new WordModel(230,"Pardon","???????????????,????????? ?????????",
                        "forgiveness,reprieve,amnesty",
                        "blame,condemn,convict",
                        "It is human nature to indulge in sin and then pray to God for pardon.")
        );
        insertIntoTable(
                new WordModel(231,"Partial","???????????????,???????????????????????????,????????????????????????????????????",
                        "incomplete,limited,qualified,imperfect,fragmentary,unfinished",
                        "whole,complete,entire",
                        "I've been especially partial to their playing of Mozart.")
                   );

        insertIntoTable(
                new WordModel(232,"Pass","???????????????????????? ?????????,?????????,???????????? ?????????",
                        "go, overtake, elapse, occupy, hand (over), kick, be transferred",
                        "fail,abide",
                        "He should have remarked on this, but let it pass.")
        );

        insertIntoTable(
                new WordModel(233,"Passionate","???????????? ????????????????????????,???????????? ???????????????????????????",
                        "intense, impassioned, ardent, fervent, vehement, heated, emotional",
                        "indifferent,dull,apathetic",
                        "She is equally passionate about cooking, and has co-authored a book on royal cuisine with her husband.")
        );

        insertIntoTable(
                new WordModel(234,"Path","??????,??????????????????,???????????????",
                        "trail,pathway,walkway,track,route,way,course,direction",
                        "expanse,extent",
                        "This way, viewers are able to track the storm's path , along with our weather team.")
        );

        insertIntoTable(
                new WordModel(235,"Patriot","?????????????????????,???????????????????????????????????????",
                        "nationalist, loyalist, chauvinist",
                        "traitor,betrayer,renegade",
                        "I believe I'm more of a patriot and more jingoistic than these people who see me as a radical.")
        );

        insertIntoTable(
                new WordModel(236,"Peace","??????????????????,?????????????????????,??????????????????????????????",
                        "tranquility, calm, restfulness",
                        "distress,rage,violence",
                        "Having a forgiving spirit is one formula to peace of mind, happiness and good health.")
        );

        insertIntoTable(
                new WordModel(237,"Pedestrain","??????????????????,????????????????????????",
                        "walker, person on foot,footer",
                        "",
                        "The second half was more pedestrian due to some extent to the pitch cutting up and also to Borris' big lead.")
        );

        insertIntoTable(
                new WordModel(238,"Pensive","??????????????????,????????????????????????????????????",
                        "thoughtful, reflective, contemplative, musing, meditative, introspective",
                        "thoughtless,ignorant,breezy",
                        "She had a beautiful, quiet smile, that was enhanced by deep pensive brown eyes.")
        );
        insertIntoTable(
                new WordModel(239,"Perform","????????????????????? ?????????,?????????????????? ??????????????? ?????????,???????????????????????? ?????????",
                        "carry out,do,execute,discharge,bring about,bring off,accomplish,achieve,fulfill",
                        "abort,halt,omit",
                        "A member of the health care team experiencing low morale may perform at a lower standard of practice than usual.")
        );
        insertIntoTable(
                new WordModel(240,"Personality","??????????????????????????????,??????????????????????????? ?????????,???????????????????????????",
                        "character, nature, disposition, temperament, makeup, persona, psyche",
                        "commonness,accolade",
                        "They would have to make a character chart listing their personality and qualities.")
        );
        insertIntoTable(
                new WordModel(241,"Persuade","????????????????????? ????????????,??????????????????????????? ?????????",
                        "prevail on, coax, convince, get, induce, win over",
                        "discourage,deter",
                        "He believes this would persuade many motorists to switch to a second-hand purchase.")
        );
        insertIntoTable(
                new WordModel(242,"Plain","??????????????????,?????????",
                        "obvious, intelligible, candid, simple, homely, sheer, patent, unpatterned, unvarnished, spare.",
                        "fancy, elaborate,unclear, obscure.",
                        "It seems quite simply to be plain clueless power-grabbing,to me.")
                  );

        insertIntoTable(
                new WordModel(243,"Poor","??????????????????,????????????",
                        "poverty-stricken, penniless, moneyless, impoverished, low-income,indigent, needy, destitute.",
                        "elite,superior,affluent",
                        "The essays are written by women who either grew up poor or are currently living in poverty.")
        );

        insertIntoTable(
                new WordModel(244,"Preserve","???????????????????????? ?????????,???????????????????????? ????????????",
                        "conserve,protect,maintain,care for,look after",
                        "demolish,devastate,jeff",
                        "Cyberspace is no longer the preserve of English speakers.")
        );

        insertIntoTable(
                new WordModel(245,"Quack","????????????????????? ?????????????????????,?????????????????????",
                        "swindler, charlatan, mountebank, trickster, fraud, fraudster",
                        "naive,good",
                        "Similarly, a new-age quack healer would disagree with a brain surgeon.")
        );

        insertIntoTable(
                new WordModel(246,"Quaint","???????????????,?????????????????????",
                        "picturesque, charming, sweet, attractive, old-fashioned",
                        "normal,ordinary",
                        "The town is charming and quaint , and real: more than just a tourist facade of Irish life.")
        );

        insertIntoTable(
                new WordModel(247,"Qualify","???????????????????????? ?????????,????????????????????????????????? ?????????,??????????????? ?????????",
                        "be eligible for, meet the requirements for, be entitled to, be permitted",
                        "disqualify,disenable",
                        "According to Government figures, 40 per cent of the elderly who qualify for cash benefits fail to claim.")
        );

        insertIntoTable(
                new WordModel(248,"Query","??????????????????????????? ?????????,??????????????????",
                        "question, inquiry,interrogation",
                        "answer,reply,response",
                        "I rang the water company to query my bill.")
        );

        insertIntoTable(
                new WordModel(249,"Quest","????????????????????????,???????????????????????????,?????????????????? ??????????????????",
                        "search, expedition, seeking, pursuance",
                        "retreat,elope,escape",
                        "My main preoccupation has been the quest for happiness.")
        );
        insertIntoTable(
                new WordModel(250,"Quiet","???????????????,????????????????????????",
                        "silent,soft,peaceful,private,unobtrusive",
                        "loud,noisy,creepy",
                        "Styling is not too flashy, yet exudes class and a quiet confidence.")
        );
        insertIntoTable(
                new WordModel(251,"Quiver","???????????????,?????????????????? ?????????",
                        "tremor, trembling, shudder, vibration",
                        "stillness,steady",
                        "Her body froze as she saw the words, the words that made her quiver with fear.")
        );
        insertIntoTable(
                new WordModel(252,"Quivive","???????????? ????????????????????????",
                        "alert",
                        "inattention, inattentiveness, inobservance",
                        "He was quivived about his danger.")
        );
        insertIntoTable(
                new WordModel(253,"Quick","???????????????,??????????????????",
                        "fast, swift, rapid, speedy, high-speed, breakneck, expeditious.",
                        "slow,time-consuming,sluggish.",
                        "We were supposed to be having ???a quick drink???, but it ended up being dinner for about eight and the bar actually ran out of wine.")
                 );

        insertIntoTable(
                new WordModel(254,"Quality","?????????,??????????????????",
                        "excellence, superiority, merit, worth, value, virtue, caliber, eminence, distinction",
                        "inferior,rotten",
                        "I think that we work to keep a certain level of quality with what we do.")
        );


        insertIntoTable(
                new WordModel(255,"Quarrel","???????????????,???????????????",
                        "argument, disagreement, squabble, fight, dispute, wrangle, clash",
                        "compromise,acquiesce,coincide",
                        "We have no quarrel with the people of the country, only with the dictator.")
        );


        insertIntoTable(
                new WordModel(256,"Quirk","??????",
                        "idiosyncrasy, peculiarity, oddity, eccentricity, foible",
                        "normality,usualness",
                        "A strange quirk of fate had led her to working for Nathan")
        );

        insertIntoTable(
                new WordModel(257,"Quitter","???????????????",
                        "partir, d??partir, donner, mourir, abandonner",
                        "gladiator,overachiever",
                        "He had known as quitter because he had left the race at the last moment.")
        );

        insertIntoTable(
                new WordModel(258,"Racism","?????????????????????????????????",
                        "racial discrimination, racialism, racial prejudice, xenophobia, chauvinism, bigotry, casteism",
                        "equality,fairness,benevolence",
                        "It is clear that people have a variety of perspectives on issues of race and racism.")
        );
        insertIntoTable(
                new WordModel(259,"Rag","?????????????????? ????????????",
                        "cloth, scrap of cloth, schmatte",
                        "acquiesce,finery",
                        "Not a rag of clothing has arrived to us this winter")
        );
        insertIntoTable(
                new WordModel(260,"Raise","??????????????????",
                        " increase,increment,lift,lift up,hold aloft, elevate, uplift, upraise, upthrust",
                        "lower,reduction",
                        "It is slowly raised upright, a careful job made more arduous by high heat and humidity.")
        );
        insertIntoTable(
                new WordModel(261,"Reverse","??????????????????",
                        "backward, inverse, rearward",
                        "forward,positive outcome.",
                        "There would be a reverse tide, flowing up the river equally as fast as the normal downriver flow.")
        );
        insertIntoTable(
                new WordModel(262,"Ramble","???????????????????????? ?????????",
                        "walk, hike, trek, wander, stroll, saunter, amble, roam, traipse, jaunt",
                        "flow,stay,determine",
                        "I rambled on about Grandma and my family for the first pint and then we talked about other stuff for the second pint.")
                  );


        insertIntoTable(
                new WordModel(263,"Rancour","???????????????",
                        "bitterness, spite, hate, hatred, resentment, malice, ill will",
                        "benevolence,charity",
                        "a person who designs, builds, or maintains engines, machines, or structures")
        );

        insertIntoTable(
                new WordModel(264,"Rational","??????????????????????????????????????????????????????",
                        "logical, reasoned, sensible, reasonable, cogent, intelligent, judicious, shrewd",
                        "mad,insane,silly.",
                        "As rational beings, then we are duty bound to be morally upright.")
        );

        insertIntoTable(
                new WordModel(265,"Reach","?????????????????????",
                        "capabilities, capacity,ambit, orbit, range, scope",
                        "depart,stalk off",
                        "He was eventually told that we had arrived at Tripoli but we still could not reach Accra until the next day at the earliest.")
        );


        insertIntoTable(
                new WordModel(266,"Reaction","????????????????????????????????????",
                        "response, answer, reply, rejoinder, retort, riposte, comeback",
                        "cause,permanence",
                        "But we're now seeing a reaction against mass production in the renaissance of organic farming and farmers' markets.")
        );

        insertIntoTable(
                new WordModel(267,"Remark","?????????????????????",
                        "comment, statement, utterance, observation, declaration",
                        "suppress,disregard",
                        "He was expecting to hear a snide remark in response but got only a satisfied sigh.")
        );
        insertIntoTable(
                new WordModel(268,"Sad","??????:?????????",
                        "unhappy, sorrowful, dejected, depressed",
                        "happy,glad,enjoyable ",
                        "It is a sad story and ironic in a way because so many French couples don't want children.")
        );
        insertIntoTable(
                new WordModel(269,"Sacrifice","?????????????????????",
                        "ritual slaughter, offering, oblation, immolation",
                        "Save,keep,hold",
                        "And when Aslan rises, the ancient stone altar on which the sacrifice was offered cracks and crumbles in pieces, never to be used again.")
        );
        insertIntoTable(
                new WordModel(270,"Select","???????????????????????? ?????????",
                        "take, choose, pick out",
                        "reject,disapprove",
                        "Young teachers felt proud to be appointed and we could select from the best available.")
        );
        insertIntoTable(
                new WordModel(271,"Sensitive","???????????????????????????",
                        "responsive to, delicate, tactful, touchy, difficult, sensible",
                        "heartless,numb,stoic",
                        "Reflected signals from radar are sensitive to water surface roughness.")
                 );

        insertIntoTable(
                new WordModel(272,"Settle","???????????? ?????????????????????",
                        "resolve, sort out, solve, clear up, end, fix, work out, iron out, straighten out, set right, rectify",
                        "depart,move,discompose.",
                        "They haven't settled down just because their old foe is gone.")
        );

        insertIntoTable(
                new WordModel(273,"Tackle","?????????????????????????????? ?????????",
                        "come to grips with, address, get to work on, set one's hand to, approach, take on, attend to",
                        "abandonment,elude.",
                        "Police see the scheme as a way to empower communities to tackle speeding hot spots.")
        );

        insertIntoTable(
                new WordModel(274,"Technique","???????????????????????????",
                        "method, approach, procedure, system, modus operandi",
                        "",
                        "The narrative technique is traditional to the point of being old-fashioned, as mentioned above.")
        );

        insertIntoTable(
                new WordModel(275,"Think","?????????????????? ?????????",
                        "conceive, consider, believe",
                        "forget,neglect.",
                        "He thinks about his result very eagerly.")
        );

        insertIntoTable(
                new WordModel(276,"Tough","????????????",
                        "durable, chewy, robust, strict, arduous, difficult",
                        "tender,fragile,gentle.",
                        "He comes from a tough area of the country where dairying, in particular, is making great strides.")
        );

        insertIntoTable(
                new WordModel(277,"Tyranny","???????????????????????????",
                        "despotism, absolute power, autocracy, dictatorship, totalitarianism",
                        "democracy,autonomy,liberty",
                        "The second mechanism by which ethnic pluralism theoretically limits democracy is by tyranny of the majority.")
        );

        insertIntoTable(
                new WordModel(278,"Ugly","?????????????????????",
                        "unattractive, unappealing, unpleasant, hideous, unlovely",
                        "beautiful,nice,preety",
                        "He translates all the ugliness and death and pain he experiences living in the community into music.")
        );
        insertIntoTable(
                new WordModel(279,"Ultimate","????????????????????????",
                        "eventual, final, concluding, terminal, end, resulting, ensuing, consequent, subsequent",
                        "first,initial,least",
                        "The individual who can take setbacks as well as frustration in stride and not lose sight of the ultimate objective in the process is a person to keep an eye on - destined to go places.")
        );

        insertIntoTable(
                new WordModel(280,"Understand","??????????????? ????????????",
                        "comprehend, grasp, take in, see, apprehend, follow, make sense of",
                        "misunderstand,misconstrue",
                        "They must take the initiative to understand indigenous languages and cultures.")
        );
        insertIntoTable(
                new WordModel(281,"Useful","??????????????????",
                        "functional, practical, handy, convenient, utilitarian, serviceable, of use, of service" +
                                "beneficial, advantageous, helpful, worthwhile, profitable, rewarding, productive, constructive, valuable, fruitful",
                        "dysfunctional,worthless,futile",
                        "As a book it has useful anecdotes, but is otherwise nothing to get excited about.")
                );

        insertIntoTable(
                new WordModel(282,"Uplift","?????????????????????",
                        "upheaval, upthrow, upthrust",
                        "demoralize,degrade",
                        "Music can uplift you, sadden you, put you in the mood for romance, pump you up, or calm you down.")
        );



        insertIntoTable(
                new WordModel(283,"Vacation","???????????????",
                        "break, time off, recess, leave, leave of absence, furlough, sabbatical, spring break",
                        "work,task,job",
                        "Three-day family vacation packages cost $155 per person, including activities and meals.")
        );

        insertIntoTable(
                new WordModel(284,"Validity","???????????????",
                        "lustiness, hardiness, robustness",
                        "dream,falsity,invalidity.",
                        "Several general practitioners were lost to follow up, which threatens the internal validity of the trial.")
        );

        insertIntoTable(
                new WordModel(285,"Vulgar","????????????????????????",
                        "rude, indecent, indelicate, offensive, distasteful, coarse, crude, ribald",
                        "classy,polite,decent.",
                        "The poet who was so courtly and gentle in his verse could be coarse and vulgar in his everyday speech.")
        );

        insertIntoTable(
                new WordModel(286,"Volume","???????????????",
                        "quantity, amount, proportion, measure, mass, bulk",
                        "crumb,driblet",
                        "There was no zipper effect when increasing/decreasing the volume, and no audible hash, even with the volume at its maximum volume level.")
        );
        insertIntoTable(
                new WordModel(287,"Voyage","????????????????????????????????????",
                        "journey, trip, expedition, excursion, tour, hike, trek, travels, pilgrimage, quest, crusade",
                        "Short journey,bide",
                        "Blake, Sefton and crew then voyaged north to the Amazon and another 1,400 miles up the rain-forested Amazon and Negro rivers.")
        );
        insertIntoTable(
                new WordModel(288,"Wage","???????????????",
                        "pay, payment,remuneration,salary, stipend, fee, honorarium, income",
                        "",
                        "That means a writer not only has to write, but crucially, have accepted, three plays a year just to earn the national average wage.")
        );
        insertIntoTable(
                new WordModel(289,"Warm","????????????",
                        "hot, balmy, heated, thick, friendly, quick, strong, affectionate, ardent",
                        "cold, cool, chilly, chilled,unfriendly, hostile",
                        "He felt its warm aroma fill his nostrils, and he turned his head away.")
        );
        insertIntoTable(
                new WordModel(290,"Wound","????????????",
                        "injury, insult, wounding, lesion",
                        "heal,cure,treatment",
                        "It is clear he is mortally wounded but, true friend that he is, he manages to warn Pepe with his dying breath.")
                  );

        insertIntoTable(
                new WordModel(291,"Weary","?????????????????????",
                        "tired, tired of, tiring, aweary",
                        "energetic,fresh,refresh.",
                        "The kids were great, bouncing around, but the adults were a bit more weary.")
        );

        insertIntoTable(
                new WordModel(292,"Wretch","????????????????????? ????????????",
                        "scoundrel, villain, rogue, rascal, reprobate, criminal, miscreant",
                        "ecstatic,superhero,euphoric.",
                        "He watched the poor wretch the commanding officer was lecturing, and looked on him with little pity.")
                );

        insertIntoTable(
                new WordModel(293,"Xenon","??????????????????????????? ????????????????????? ?????????",
                        "",
                        "",
                        "He estimates future conversion efficiencies of several percent with tin, whereas xenon has a 1% limit.")
        );

        insertIntoTable(
                new WordModel(294,"X-Ray","????????????????????? ???????????????????????? ????????? ???????????? ????????????????????????????????? ?????????????????? ???????????????????????????????????? ????????????????????? ????????????????????????????????? ??????????????????",
                        "radiograph, radiogram, X-ray image/picture/photograph, roentgenogram",
                        "",
                        "Another casualty among the debris was Rangers' Chris Burke, who will go for an X-ray today after going over an ankle in the most innocuous circumstances.")
        );

        insertIntoTable(
                new WordModel(295,"Xerox","?????????????????? ?????????????????????????????????",
                        "photocopy, copy, run off, reproduce, replicate, duplicate, mimeograph",
                        "",
                        "Ravi uses the xerox machine for his important task.")
        );

        insertIntoTable(
                new WordModel(296,"Xenophobia","??????????????????????????? ???????????????????????? ?????????????????? ?????????",
                        "",
                        "",
                        "We are suggesting that nationalist xenophobia is precisely a function of that which purports to bring us all together.")
        );

        insertIntoTable(
                new WordModel(297,"Xylem","??????????????????",
                        "",
                        "",
                        "The conducting tissues within the vascular bundles are the xylem and phloem.")
        );
        insertIntoTable(
                new WordModel(298,"Yacht","????????????",
                        "",
                        "",
                        "A young woman who is a stewardess on a ferry becomes a skipper on a racing yacht.")
        );
        insertIntoTable(
                new WordModel(299,"Yawn","????????? ????????????",
                        "yawning, oscitancy",
                        "",
                        "He began yawning and looking at his watch")
        );
        insertIntoTable(
                new WordModel(300,"Yule","???????????????????????? ???????????? ????????? ???????????????????????? ???????????? ????????????????????? ????????????????????? ??????????????? ???????????????????????????",
                        "",
                        "",
                        "The solstices, Yule and Midsummer, are festivals of the God.")
        );
        insertIntoTable(
                new WordModel(301,"Youth","????????????",
                        "freshness, bloom, vigor, energy",
                        "aged,maturity,adulthood",
                        "He had been a keen sportsman in his youth")
                  );


        insertIntoTable(
                new WordModel(302,"Zest","????????????",
                        "enthusiasm, piquancy, rind, nip, zestfulness",
                        "",
                        "A day in advance, put the citrus zests , juice, sherry and brandy in a bowl to soak.")
        );

        insertIntoTable(
                new WordModel(303,"Zinc","???????????????",
                        "",
                        "",
                        "The motherboards have 120 mm PVC spacers to keep them apart and are threaded along M4 zinced thread section.")
        );

        insertIntoTable(
                new WordModel(304,"Zodiac","????????????????????????",
                        "",
                        "",
                        "The apparent paths of the sun, the moon, and the major planets all fall within the zodiac.")
        );

        insertIntoTable(
                new WordModel(305,"Zoom","???????????????????????? ????????? ?????????",
                        "soar, rapid growth",
                        "dawdle,bawl,struggle.",
                        "The camera zoomed in for a close-up of his face")
        );

        insertIntoTable(
                new WordModel(306,"Zephyr","???????????????????????? ???????????????",
                        "",
                        "",
                        "Maybe the zephyr has blown around us!!")
        );


    }

    private void insertIntoTable(WordModel model) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_word, model.getWord());
        cv.put(TAB_meaning, model.getMeaning());
        cv.put(TAB_synonym, model.getSynonym());
        cv.put(TAB_antonym, model.getAntonym());
        cv.put(TAB_example, model.getExample());


        sq.insert(TABLE_NAME, null, cv);
        sq.close();

}

    WordModel word_fetch(String word) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM "
                + TABLE_NAME + " WHERE " + TAB_word + " like '" + word + "'";

        Cursor c = sq.rawQuery(q, null);
        WordModel store_word = null;

        while (c.moveToNext()) {
                store_word = new WordModel(
                        c.getInt(c.getColumnIndex(TAB_id)),
                        c.getString(c.getColumnIndex(TAB_word)),
                        c.getString(c.getColumnIndex(TAB_meaning)),
                        c.getString(c.getColumnIndex(TAB_synonym)),
                        c.getString(c.getColumnIndex(TAB_antonym)),
                        c.getString(c.getColumnIndex(TAB_example))
                );
        }
        c.close();
        return store_word;
    }


    List<String> word_fetch_all() {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM "
                + TABLE_NAME ;

        Cursor c = sq.rawQuery(q, null);
        List<String> store_word = new ArrayList<>();

        while (c.moveToNext()) {
                store_word.add(c.getString(c.getColumnIndex(TAB_word)));
        }
        c.close();
        return store_word;
    }

    public void AddingHistoryToTable(Data_item ht) {

        SQLiteDatabase sqd = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_his, ht.getName());


        sqd.insert(TABLE_NAME_HIS, null, cv);
        sqd.close();
    }

    public String[] his_data() {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM " + TABLE_NAME_HIS;
        Cursor c = sq.rawQuery(q, null);

        String[] store_data = new String[c.getCount()];

        if (c.moveToFirst()){
            int counter = 0;
            do {
                store_data[counter]= new String(c.getString(c.getColumnIndex(TAB_his)));
                counter= counter+1;
            } while (c.moveToNext());
        }
        c.close();
        return store_data;


    }

}

