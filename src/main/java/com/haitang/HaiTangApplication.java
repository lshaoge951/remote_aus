package com.haitang;

import com.haitang.project.tool.DemoServerHandler;
import com.haitang.project.tool.audio.Playback;
/*import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.awt.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * 启动程序
 * 
 * @author haitang
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HaiTangApplication
{
    // 端口号，要求客户端与服务器端一致
    //private static int PORT = 3344;

    public static void main(String[] args)
    {
        //ServerSocket serSocket;
        //System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(HaiTangApplication.class, args);
        System.out.println("远程听诊系统启动成功");
        /*IoAcceptor acceptor = null;
        try {
            // 创建一个非阻塞的server端的Socket
            acceptor = new NioSocketAcceptor();
            // 设置过滤器（使用mina提供的文本换行符编解码器）
            acceptor.getFilterChain().addLast("codec",
                    new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"),
                            LineDelimiter.WINDOWS.getValue(), LineDelimiter.WINDOWS.getValue())));
            // 自定义的编解码器
            // acceptor.getFilterChain().addLast("codec", new
            // ProtocolCodecFilter(new CharsetCodecFactory()));
            // 设置读取数据的换从区大小
            acceptor.getSessionConfig().setReadBufferSize(2048);
            // 读写通道10秒内无操作进入空闲状态
            acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);
            // 为接收器设置管理服务
            acceptor.setHandler(new DemoServerHandler());
            // 绑定端口
            acceptor.bind(new InetSocketAddress(PORT));
            System.out.println("服务器启动成功... 端口号未：" + PORT);

        } catch (Exception e) {
            System.out.println("服务器启动异常...");
            e.printStackTrace();
        }*/


        /*System.setProperty("java.awt.headless", "false");
        Socket client;
        InputStream in = null;
        BufferedReader br;
        OutputStream out;
        BufferedWriter bw;
        TextField tf=new TextField(20);
        TextArea ta=new TextArea();
        try{
            ServerSocket serSocket=new ServerSocket(5000);
            client=serSocket.accept();
            ta.append("client host"+client.getInetAddress().getHostName()+"\n\n");
            in=client.getInputStream();
            br=new BufferedReader(new InputStreamReader(in));
            out=client.getOutputStream();
            bw=new BufferedWriter(new OutputStreamWriter(out));
            ServerSocket serSock=new ServerSocket(6000);
            Socket cli=serSock.accept();
            Playback player=new Playback(cli);
            player.start();
        }catch(Exception e){

        }
        while(true)
        {
            try
            {
                byte[] buf=new byte[200];
                in.read(buf);
                String str=new String(buf);
                ta.append("Client say:"+str);
                ta.append("\n");
            }
            catch(Exception e)
            {
            }
        }*/


    }
}