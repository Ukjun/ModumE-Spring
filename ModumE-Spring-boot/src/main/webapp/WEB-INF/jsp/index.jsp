<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="StringUtils" class="com.amolrang.modume.utils.StringUtils"/>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
    <link rel="stylesheet" href="/css/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Material+Icons" rel="stylesheet">
</head>
<body>
<div id="bg1">
        <img src="/img/yousef-salhamoud-kQ6mh2yagDw-unsplash.jpg" alt="" id="bg1_1">
    </div>
    <main class="centralContainer">
        <header class="centralHeader">
            <div class="centralLogo">
                <img id="centralLogoImage" src="/img/logowhite.png" alt="">
            </div>
            <div class="centralSearch">
                <form action="" method="POST" class="centralSearchFrm">
                    <div class="centralSearch1_1">
                        <input type="text" name="" id="" class="Search1_1__input" placeholder="검색">
                    </div>
                    <div class="centralSearch1_2">
                        <span class="material-icons headMenus" onclick="submit()">search</span>
                    </div>
                </form>
            </div>
            <div class="centralMenu">
                <div class="menus centralMenu1_1">
                    <span class="material-icons">notifications_none</span>
                </div>
                <div class="menus centralMenu1_2">
                    <span class="material-icons"><a href="/menu">person_outline</a></span>
                </div>
            </div>
        </header>
        <section class="centralSection">
            <!-- jsp include -->
            <div class="sectionContainer">
                <div class="slideContainer">
                	<%-- <video autoplay="autoplay" controls>
                		<source src = "/videos/${videoName }" type="video/mp4">	
                	</video> --%>
                    <div class="slide slide__left">
                        <span class="material-icons">keyboard_arrow_left</span>
                    </div>
                    <div class="slide slide__center" id="twitch-embed"></div>
                    <div class="slide slide__right">
                        <span class="material-icons">keyboard_arrow_right</span>
                    </div>
                </div>
            </div>
            <aside class="centralSidebar">
                <div class="menus sidebarMenu1_1">
                    <span class="material-icons" onclick="boardInit()">assignment</span>
                </div>
                <div class="menus sidebarMenu1_2">
                    <span class="material-icons" onclick="chatInit()">chat</span>
                </div>
            </aside>
        </section>
    </main>
    <script src="/js/index.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <!-- 트위치 채널 긁어오기(채널지정) -->
    <script src="https://embed.twitch.tv/embed/v1.js"></script>
    <script>
    /* $.ajax({
    	 type: 'GET',
    	 url: 'https://api.twitch.tv/kraken/channels/twitch',
    	 headers: {
    	   'Client-ID': '95put5vj4zw23iiy5poetela3ilbq6'
    	 },
    	 success: function(data) {
    	   console.log(data);
    	 }
    	});
      
    xhr.send(); */
    new Twitch.Embed("twitch-embed", {
        width: 854,
        height: 480,
        channel: "2chamcham2",
        // only needed if your site is also embedded on embed.example.com and othersite.example.com 
        parent: ["embed.example.com", "othersite.example.com"]
      });
    
    </script>
</body>
</html>