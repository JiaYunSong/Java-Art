<%-- 
    Document   : userpage
    Created on : 2019-8-11, 13:20:14
    Author     : 贾云嵩
--%>

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="Databean" scope="session" class="nqsdata.beans.Databean"/>
<%
    request.setCharacterEncoding("utf-8");
    String UserType=(String) session.getAttribute("UserType");
    String modeValue=request.getParameter("modeValue");
    String stateValue=request.getParameter("stateValue");
    String alterValue=request.getParameter("alterValue");
    String alterType[]={"添加数据","更改数据","删除数据"};
    String DataMess=request.getParameter("DataMess");
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" media="screen" href="css/title.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/userpage.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/foot.css" />
        <title>我国各民族人口性别构成网络查询系统</title>
    </head>
    <body>
        <jsp:include page="adandor/title.jsp"/>
        <div id="all">
            <%if("查询服务".equals(modeValue) || modeValue==null){%>
            <div id="mode">
                <form action="userpage.jsp" method="post">
                    <input type="button" class="input_out"
                           onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"
                           onclick="this.form.submit()" value="查询服务"/>
                    <input type="hidden" name="modeValue" value="查询服务">
                </form>
                <%if("admin".equals(UserType)){%>
                <form action="userpage.jsp" method="post">
                    <input type="button" class="input_out"
                           onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"
                           onclick="this.form.submit()" value="更改服务"/>
                    <input type="hidden" name="modeValue" value="更改服务">
                </form>
                <%}%>
            </div>
            <div id="state">
                <form action="userpage.jsp" method="post">
                    <div>索引:</div>
                    <input type="text" name="DataMess"/>
                    <input type="submit" style="font-size: 18px" value="查询"/>
                    <br/>
                    <input type="radio" name="stateValue" value="以民族名称为索引查询" checked>
                    以民族名称为索引查询&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="stateValue" value="以男性人数为索引查询">
                    以男性人数为索引查询&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="stateValue" value="以女性人数为索引查询">
                    以女性人数为索引查询
                    <input type="hidden" name="modeValue" value="查询服务">
                </form>
                <div style="margin-left: 80px;margin-top: 80px;">
                <%if(stateValue!=null && (!"".equals(DataMess))){
                    boolean que=false;
                    String NationName=null,MenPop=null,WomPop=null;
                    if("以民族名称为索引查询".equals(stateValue))
                        if(Databean.queNationName(DataMess)==null)
                            que=false;
                        else{
                            que=true;
                            NationName=Databean.queNationName(DataMess)[0];
                            MenPop=Databean.queNationName(DataMess)[1];
                            WomPop=Databean.queNationName(DataMess)[2];
                        }
                    else if("以男性人数为索引查询".equals(stateValue))
                        if(Databean.queMenPop(DataMess)==null)
                            que=false;
                        else{
                            que=true;
                            NationName=Databean.queMenPop(DataMess)[0];
                            MenPop=Databean.queMenPop(DataMess)[1];
                            WomPop=Databean.queMenPop(DataMess)[2];
                        }
                    else if("以女性人数为索引查询".equals(stateValue))
                        if(Databean.queWomPop(DataMess)==null)
                            que=false;
                        else{
                            que=true;
                            NationName=Databean.queWomPop(DataMess)[0];
                            MenPop=Databean.queWomPop(DataMess)[1];
                            WomPop=Databean.queWomPop(DataMess)[2];
                        }
                    if(que){%>
                        <table class="gridtable">
                            <tr>
                                <td>民族名称</td>
                                <td>男性人口</td>
                                <td>男性比重</td>
                                <td>女性人口</td>
                                <td>女性比重</td>
                                <td>性别比例</td>
                            </tr>
                            <tr>
                                <%
                                    String MenPor=String.valueOf(Integer.valueOf(MenPop)/(Integer.valueOf(MenPop)+Integer.valueOf(WomPop)+0.0));
                                    if(MenPor.length()>9) MenPor=MenPor.substring(0, 8);
                                    String WomPor=String.valueOf(Integer.valueOf(WomPop)/(Integer.valueOf(MenPop)+Integer.valueOf(WomPop)+0.0));
                                    if(WomPor.length()>9) WomPor=WomPor.substring(0, 8);
                                    String M_WPor=String.valueOf(Integer.valueOf(MenPop)/(Integer.valueOf(WomPop)+0.0)*100);
                                    if(M_WPor.length()>9) M_WPor=M_WPor.substring(0, 8);
                                %>
                                <td><%=NationName%></td>
                                <td><%=MenPop%></td>
                                <td><%=MenPor%>%</td>
                                <td><%=WomPop%></td>
                                <td><%=WomPor%>%</td>
                                <td><%=M_WPor%>%</td>
                            </tr>
                        </table>
                    <%}else{%>
                    <font style="margin-left: 20px;color: #ff3333;" face="黑体" size="6">
                            对不起，未找到该民族信息!
                        </font>
                    <%}
                }%>
                </div>
            </div>
            <%}else if("更改服务".equals(modeValue)){%>
            <div id="alter">
                <form action="userpage.jsp" method="post">
                    <input type="button" class="input_out"
                           onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"
                           onclick="this.form.submit()" value="<  返回上一级"/>
                    <input type="hidden" name="modeValue" value="查询服务">
                </form>
                <%for(String altertype:alterType){%>
                <form action="userpage.jsp" method="post">
                    <input type="button" class="input_out"
                           onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"
                           onclick="this.form.submit()" value="<%=altertype%>"/>
                    <input type="hidden" name="modeValue" value="<%=modeValue%>">
                    <input type="hidden" name="alterValue" value="<%=altertype%>">
                </form>
                <%}%>
            </div>
            <%String mes=request.getParameter("mes");
            if(mes!=null){
                String NationName=request.getParameter("NationName");
                String MenPop=request.getParameter("MenPop");
                String WomPop=request.getParameter("WomPop");
                if("添加数据".equals(alterValue))
                    if(NationName!=null && NationName!="" && MenPop!=null && MenPop!="" && WomPop!=null && WomPop!="")
                        mes="添加结果："+Databean.addData(NationName, MenPop, WomPop)+"!";
                    else
                        mes="输入有误!";
                else if("更改数据".equals(alterValue))
                    if(NationName!=null && NationName!="" && MenPop!=null && MenPop!="" && WomPop!=null && WomPop!="")
                        mes="更改结果："+Databean.revData(NationName, MenPop, WomPop)+"!";
                    else
                        mes="输入有误!";
                else if("删除数据".equals(alterValue))
                    if(NationName!=null && NationName!="")
                        mes="删除结果："+Databean.delData(NationName)+"!";
                    else
                        mes="输入有误!";
            }%>
            <div id="alter-data">
                <div></div>
                <form action="userpage.jsp" method="post">
                    <div id="alter-dataput">
                        <div>民族名称:</div>
                        <input type="text" name="NationName"/>
                    </div>
                    <%if(!"删除数据".equals(alterValue)){%>
                        <div id="alter-dataput">
                            <div>男性人口：</div>
                            <input type="text" name="MenPop"/>
                        </div>
                        <div id="alter-dataput">
                            <div>女性人口：</div>
                            <input type="text" name="WomPop"/>
                        </div>
                    <%}if(alterValue==null) alterValue="添加数据";%>
                    <input type="submit" id="alterbottum" value="<%=alterValue%>"/>
                    <input type="hidden" name="modeValue" value="<%=modeValue%>">
                    <input type="hidden" name="alterValue" value="<%=alterValue%>">
                    <input type="hidden" name="mes" value="putting">
                </form>
                <%if(mes!=null){%>
                    <div><%=mes%></div>
                <%}%>
            </div>
            <%}%>
        </div>
        <jsp:include page="adandor/foot.jsp"/>
    </body>
</html>
