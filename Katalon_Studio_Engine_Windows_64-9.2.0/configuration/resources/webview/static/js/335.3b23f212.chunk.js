"use strict";(self.webpackChunkkatalon_webview=self.webpackChunkkatalon_webview||[]).push([[335],{335:function(e,t,n){n.r(t),n.d(t,{default:function(){return se}});var a=n(9439),i=n(3717),o=n(4946),s=n(283),r=n(6252),c=n(1795),l=n(6513),d=n(2791),p=d.createContext(),m=n(7447),f=n(8596),h=n(221),x=n(968),u=n(9341);var g=n.p+"static/media/step-1-extract-the-zip-file.ad2056598a54b78925eae3c1c6d2adff.svg";var v=n.p+"static/media/step-2-find-katalonc.exe.80fbf677e9e0a2e751435ab380f850d2.svg";var y=n.p+"static/media/step-3-enter-cmd-in-the-folder-path.9c8530138a6559a5a9df1c0a68746e85.svg";var b=n.p+"static/media/step-4-the-command-prompt-is-ready.c78217a3bfddfd1d9c5036b479c3dce5.svg";var Z=n.p+"static/media/step-5-paste-the-generated-command.963bbc72ca424c57a75defd6327e1cf9.svg";var j=n.p+"static/media/step-1-extract-the-zip-file.b684df6083e804e144f4c2d1d868cad5.svg";var w=n.p+"static/media/step-2-select-show-package-content.9c7c04e1f2351e61f5ba4f7b637d74c8.svg";var S=n.p+"static/media/step-3-select-new-terminal-at-folder.2983a244abdbd435fd92106f65385491.svg";var C=n.p+"static/media/step-4-the-command-prompt-is-ready.cc3ec083aac16f890c68752470eb9fb7.svg";var E=n.p+"static/media/step-5-paste-the-generated-command.90e5275be73ddda29a454786c61e03cf.svg";var k=n.p+"static/media/step-1-extract-the-zip-file.2f08c88da5aaad134247a56fb5f4c130.svg";var z=n.p+"static/media/step-2-select-open-in-terminal.ae2fdcf5f433a024af101efbf5842853.svg";var I=n.p+"static/media/step-3-the-command-prompt-is-ready.fc7256da64696d29a9d6b94c9e41e831.svg";var R=n.p+"static/media/step-4-paste-the-generated-command.a3fcdff9c135523c9bebfb693c0c89ee.svg",F=["Extract the zip file",'Select "Show Package Content"','Select "New Terminal at Folder"',"The command prompt is ready","Paste the generated command"],T=["Extract the zip file",'Find "katalonc.exe"','Enter "cmd" in the folder path',"The command prompt is ready","Paste the generated command"],N=["Extract the zip file",'Select "Open in Terminal"',"The command prompt is ready","Paste the generated command"],K=[g,v,y,b,Z],L=[j,w,S,C,E],M=[k,z,I,R],O=["#D3E2DF","#ECF4F2","#E8EAF6","#D4D5F7","#E8EAF6"],D=["Have you downloaded Katalon Runtime Engine (KRE) successfully? Let's extract the zipped file!",'In the extracted folder, right-click "Katalon Studio Engine" and select "Show Package Contents".','Next, go to Contents > MacOS. Right-click on MacOS folder and select "New Terminal at Folder"',"Yay! You have successfully launched the command prompt for KRE execution!","Now, paste the generated command into the command prompt, press Enter and observe the results."],P=["Have you downloaded Katalon Runtime Engine (KRE) successfully? Let's extract the zipped file!",'In the extracted folder, you can find the "katalonc.exe".','From there, enter "cmd" in replacement of the folder path to launch the command prompt.',"Yay! You have successfully launched the command prompt for KRE execution!","Now, paste the generated command into the command prompt, press Enter and observe the results."],Y=["Have you downloaded Katalon Runtime Engine (KRE) successfully? Let's extract the zipped file!",'Next, right-click on the extracted folder and select "Open in Terminal"',"Yay! You have successfully launched the command prompt for KRE execution!","Now, paste the generated command into the command prompt, press Enter and observe the results."],A=[3,1,5,5,3],H=[3,1,5,3],W=n(184),_=(0,f.Z)({icon:{"& .MuiStepIcon-active":{color:"black"},"& .MuiStepIcon-completed":{color:"green"}},description:{fontWeight:"medium"}}),B=function(){var e=d.useState(0),t=(0,a.Z)(e,2),n=t[0],i=t[1],s=d.useState({}),r=(0,a.Z)(s,2),c=r[0],l=r[1],m=d.useContext(p).setStepIndex,f=d.useContext(p).localOS,g=null;"win32"===f?g=T:"macosx"===f?g=F:"linux"===f&&(g=N);var v=function(e,t){var n=c;n[e]=t,l(n)},y=function(e){v(n,!0),function(e){i(e)}(e)},b=_();return(0,W.jsx)(o.Z,{children:(0,W.jsx)(h.Z,{className:b.icon,nonLinear:!0,activeStep:n,orientation:"vertical",style:{padding:"0px",marginTop:"15px"},children:g.map((function(e,t){return(0,W.jsx)(x.Z,{className:b.description,completed:c[t],children:(0,W.jsx)(u.Z,{style:{fontSize:"0.875rem"},color:"inherit",onClick:(n=t,function(){n in c&&!1!==c[n]?(v(n,!1),y(n)):y(n),m(n)}),children:e})},e);var n}))})})},G=(0,f.Z)((function(e){return{image:{width:"100%",height:"auto"}}})),U=function(){var e=G(),t=d.useContext(p).stepIndex,n=d.useContext(p).localOS,a=null;return"win32"===n?a=K:"macosx"===n?a=L:"linux"===n&&(a=M),(0,W.jsx)(o.Z,{style:{display:"flex",alignSelf:"flex-end",justifyContent:"flex-end"},children:(0,W.jsx)("img",{src:a[t],alt:"instructions",className:e.image,style:{objectFit:"cover",width:"600px",height:"213px"}})})},q=n(8302),J=n(426),Q=function(){var e=d.useContext(p).stepIndex,t=d.useContext(p).localOS,n=null,a=null;return"win32"===t?(n=P,a=A):"macosx"===t?(n=D,a=A):"linux"===t&&(n=Y,a=H),(0,W.jsxs)(o.Z,{style:{display:"flex",flexDirection:"column",padding:"16px",width:"50%"},children:[(0,W.jsx)(o.Z,{children:(0,W.jsx)(q.Z,{style:{fontWeight:400,fontSize:"0.875rem"},dangerouslySetInnerHTML:{__html:n[e]}})}),(0,W.jsxs)(o.Z,{style:{display:"flex",alignItems:"center",marginTop:"5px"},children:[(0,W.jsx)(J.Z,{style:{fontSize:"0.875rem",marginRight:"10px"}}),(0,W.jsx)(q.Z,{style:{fontSize:"0.875rem",marginRight:"10px"},component:"p",children:"ETA"}),(0,W.jsx)("div",{style:{borderRight:"1px solid gray",height:"14px",marginRight:"10px"}}),(0,W.jsxs)(q.Z,{style:{fontSize:"0.875rem",marginRight:"10px"},children:[a[e],"m"]})]})]})},V=function(){var e=d.useContext(p).stepIndex;return(0,W.jsxs)(o.Z,{style:{display:"flex",backgroundColor:O[e],width:623,height:294,borderRadius:"4px",paddingLeft:"32px",paddingTop:"29px",boxSizing:"border-box"},children:[(0,W.jsx)(Q,{}),(0,W.jsx)(U,{})]})},X=function(e){var t=e.os,n=(0,d.useState)(0),i=(0,a.Z)(n,2),s=i[0],r=i[1],c=t;return(0,W.jsx)(p.Provider,{value:{stepIndex:s,setStepIndex:r,localOS:c},children:(0,W.jsxs)(o.Z,{style:{display:"flex",width:"100%",height:"100%",justifyContent:"center"},children:[(0,W.jsx)(B,{os:t}),(0,W.jsx)(m.Z,{flexItem:!0,orientation:"vertical",style:{height:"294px",alignSelf:"center",marginLeft:"22px",marginRight:"32px"}}),(0,W.jsx)(V,{os:t})]})})},$=n(1288),ee=n(8148);var te=n.p+"static/media/congratulations-page.1c9e90d20b2712c66d3ff25e374646af.svg",ne=n(996),ae=function(){return(0,W.jsxs)($.Z,{container:!0,spacing:2,style:{backgroundColor:"#ECF4F2"},children:[(0,W.jsx)($.Z,{item:!0,xs:4,children:(0,W.jsxs)(o.Z,{style:{position:"relative",top:"70px",left:"50px",bottom:"130px",alignItems:"center"},children:[(0,W.jsx)(q.Z,{style:{fontFamily:"Inter",fontWeight:600,fontSize:"20px"},children:"Congratulations! You have learned how to execute tests with Katalon Runtime Engine!"}),(0,W.jsx)(q.Z,{style:{fontFamily:"Inter",marginTop:"8px",fontSize:"14px"},children:"Get ready to integrate with CI/CD pipelines."}),(0,W.jsxs)(l.Z,{style:{textTransform:"none",color:"white",backgroundColor:"#000000",borderRadius:"4px",fontFamily:"Inter",fontSize:"12px",width:"120px",height:"28px",marginTop:"20px"},variant:"contained",size:"small",color:"primary",disableElevation:!0,onClick:function(){ne.Z.learnMoreAboutCICD()},children:["Learn more"," ",(0,W.jsx)(ee.Z,{style:{fontSize:"1.1rem"}})]})]})}),(0,W.jsx)($.Z,{item:!0,xs:8,style:{padding:"0px"},children:(0,W.jsx)(o.Z,{style:{display:"flex",justifyContent:"flex-end"},children:(0,W.jsx)("img",{src:te,alt:"Congratulations!",style:{objectFit:"none",width:"536px",display:"block"}})})})]})},ie=(0,i.Z)({typography:{fontFamily:"Inter"}}),oe=function(e){var t=e.os,n=d.useState(!1),i=(0,a.Z)(n,2),p=i[0],m=i[1];return p?(0,W.jsx)(ae,{}):(0,W.jsxs)(o.Z,{style:{boxSizing:"border-box",marginTop:"0px"},elevation:0,children:[(0,W.jsx)(s.Z,{elevation:0,children:(0,W.jsx)(r.Z,{style:{padding:"8px",boxSizing:"border-box"},children:(0,W.jsx)(c.Z,{theme:ie,children:(0,W.jsx)(X,{os:t})})})}),(0,W.jsx)(o.Z,{style:{display:"flex",justifyContent:"flex-end"},children:(0,W.jsx)(c.Z,{theme:ie,children:(0,W.jsx)(l.Z,{style:{marginTop:20,marginRight:15,textTransform:"none",color:"white",width:150,height:28,fontWeight:600},variant:"contained",size:"small",color:"primary",disableElevation:!0,onClick:function(){m(!0),ne.Z.clickIGotItBtn()},children:"I got it"})})})]})};function se(){var e=new URLSearchParams(window.location.search).get("os");return(0,W.jsx)(oe,{os:e})}},6252:function(e,t,n){var a=n(7462),i=n(5987),o=n(2791),s=n(8182),r=n(2953),c=o.forwardRef((function(e,t){var n=e.classes,r=e.className,c=e.component,l=void 0===c?"div":c,d=(0,i.Z)(e,["classes","className","component"]);return o.createElement(l,(0,a.Z)({className:(0,s.Z)(n.root,r),ref:t},d))}));t.Z=(0,r.Z)({root:{padding:16,"&:last-child":{paddingBottom:24}}},{name:"MuiCardContent"})(c)},283:function(e,t,n){var a=n(7462),i=n(5987),o=n(2791),s=n(8182),r=n(9526),c=n(2953),l=o.forwardRef((function(e,t){var n=e.classes,c=e.className,l=e.raised,d=void 0!==l&&l,p=(0,i.Z)(e,["classes","className","raised"]);return o.createElement(r.Z,(0,a.Z)({className:(0,s.Z)(n.root,c),elevation:d?8:1,ref:t},p))}));t.Z=(0,c.Z)({root:{overflow:"hidden"}},{name:"MuiCard"})(l)}}]);
//# sourceMappingURL=335.3b23f212.chunk.js.map