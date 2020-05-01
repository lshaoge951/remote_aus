package com.haitang.project.system.record.controller;

import com.aliyun.oss.OSSClient;
import com.haitang.common.constant.Constants;
import com.haitang.common.utils.StringUtils;
import com.haitang.framework.aspectj.lang.annotation.Log;
import com.haitang.framework.aspectj.lang.enums.BusinessType;
import com.haitang.framework.web.domain.AjaxResult;
import com.haitang.framework.web.page.TableDataInfo;
import com.haitang.project.monitor.server.domain.SoundDetailVo;
import com.haitang.project.system.baseinfo.domain.SoundPatientBaseinfo;
import com.haitang.project.system.baseinfo.service.ISoundPatientBaseinfoService;
import com.haitang.project.system.connectOnline.domain.ConnectOnline;
import com.haitang.project.system.connectOnline.service.IConnectOnlineService;
import com.haitang.project.system.detail.domain.SoundPatientDetail;
import com.haitang.project.system.detail.service.ISoundPatientDetailService;
import com.haitang.project.system.deviceMgt.service.IDeviceMgtService;
import com.haitang.project.system.fileLog.domain.FileLog;
import com.haitang.project.system.fileLog.service.IFileLogService;
import com.haitang.project.system.parts.domain.BodyParts;
import com.haitang.project.system.parts.service.IBodyPartsService;
import com.haitang.project.system.record.service.ISoundRecordService;
import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundPatientBody.service.ISoundPatientBodyService;
import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.soundSelect.service.ISoundSelectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

@Api("听诊录音")
@Controller
@RequestMapping("/app/soundRec")
public class FrontSoundController {

    @Autowired
    private IDeviceMgtService deviceMgtService;

    @Autowired
    private IBodyPartsService bodyPartsService;

    @Autowired
    private ISoundRecordService soundRecordService;
    @Autowired
    private ISoundPatientBaseinfoService soundPatientBaseinfoService;
    @Autowired
    private ISoundPatientBodyService soundPatientBodyService;
    @Autowired
    private ISoundPatientDetailService soundPatientDetailService;
    @Autowired
    private ISoundSelectService selectService;
    @Autowired
    private IFileLogService fileLogService;
    @Autowired
    private IConnectOnlineService connectOnlineService;

    @PostMapping("/listPatBody")
    @ApiOperation("列举")
    @ResponseBody
    public List<SoundPatientBody> listPatBody(SoundPatientBody soundPatientBody){
        List<SoundPatientBody> list = soundPatientBodyService.selectSoundPatientBodyList(soundPatientBody);
        return list;
    }

    @PostMapping("/saveBatchPatBody")
    @ApiOperation("列举")
    @ResponseBody
    public Map<String,Object> saveBatchPatBody(List<SoundPatientBody> soundPatientBodys)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        for (SoundPatientBody soundPatientBody:soundPatientBodys) {
            soundPatientBodyService.insertSoundPatientBody(soundPatientBody);
        }
        //List<SoundPatientBody> list = soundPatientBodyService.selectSoundPatientBodyList(soundPatientBody);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }


    /**
     * 查询【请填写功能名称】列表
     */
    @ApiOperation("诊断列表")
    @PostMapping("/listBaseInfo")
    @ResponseBody
    public List<SoundPatientBaseinfo> listBaseInfo(String token,Integer isLocal,Integer isMyShare,Integer shareToMe)
    {
        SoundPatientBaseinfo soundPatientBaseinfo = new SoundPatientBaseinfo();

        List<SoundPatientBaseinfo> list = soundPatientBaseinfoService.selectSoundPatientBaseinfoList(soundPatientBaseinfo);
        return list;
    }

    /**
     * 新增保存身体部位录音
     */
    @Log(title = "身体部位录音", businessType = BusinessType.INSERT)
    @PostMapping("/addPaintBody")
    @ResponseBody
    public Map<String,Object> addPaintBody(SoundPatientBody soundPatientBody)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        //soundPatientBody.setRecordId("asfljasdlk56723");
        soundPatientBody.setEnabled(1);
        soundPatientBodyService.insertSoundPatientBody(soundPatientBody);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 分享录音
     */
    @Log(title = "分享录音", businessType = BusinessType.INSERT)
    @PostMapping("/share")
    @ResponseBody
    public Map<String,Object> share(String shareAccount, String token, String recordId)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }

    /**
     * 获取在线列表
     */
    @Log(title = "获取在线列表", businessType = BusinessType.INSERT)
    @PostMapping("/getConnList")
    @ResponseBody
    public Map<String,Object> getConnList()
    {
        //创建返回获取
        Map<String,Object> map = new HashMap<>();
        List<ConnectOnline> connectOnlines = connectOnlineService.selectSoundPatientBodyById();
        map.put("id","1");
        //map.put("data",connectOnlines);
        map.put("message",connectOnlines);
        return map;
    }
    /**
     * 获取在线列表
     */
    @Log(title = "获取在线列账户", businessType = BusinessType.INSERT)
    @PostMapping("/getConnOne")
    @ResponseBody
    public ConnectOnline getConnOne(String token)
    {
        //创建返回获取
        Map<String,Object> map = new HashMap<>();
        ConnectOnline connectOnlines = connectOnlineService.selectOnline(token);
        //map.put("id","1");
        //map.put("data",connectOnlines);
        //map.put("message",connectOnlines);
        return connectOnlines;
    }
    /**
     * 获取在线列表
     */
    @Log(title = "获取在线列账户", businessType = BusinessType.INSERT)
    @PostMapping("/getConnByDevice")
    @ResponseBody
    public Map<String,Object> getConnByDevice(String device)
    {
        //创建返回获取
        Map<String,Object> map = new HashMap<>();

        List<ConnectOnline> connectOnlines = connectOnlineService.selectSoundPatientBodyById();
        List<ConnectOnline> list = new ArrayList<>();
        for (ConnectOnline connectOnline:connectOnlines) {
            if (device.equals(connectOnline.getToken())) {
                list.add(connectOnline);
            }

        }
        if (list.size() > 0){
            map.put("data","1");
        }else{
            map.put("data","0");
        }
        map.put("code","200");
        map.put("msg","success");
        return map;
    }

    /**
     * 上线操作
     */
    @Log(title = "获取在线列表", businessType = BusinessType.INSERT)
    @PostMapping("/creatOnline")
    @ResponseBody
    public Map<String,Object> creatOnline(String token,String address)
    {
        //创建返回获取
        Map<String,Object> map = new HashMap<>();
        connectOnlineService.insertConnect(token, address);
        map.put("code","200");
        //map.put("data",connectOnlines);
        map.put("msg","success");
        return map;
    }

    /**
     * 上线操作
     */
    @Log(title = "断开连接", businessType = BusinessType.INSERT)
    @PostMapping("/removeOnline")
    @ResponseBody
    public Map<String,Object> creatOnline(String token)
    {
        //创建返回获取
        Map<String,Object> map = new HashMap<>();
        connectOnlineService.deleteConnect(token);
        map.put("code","200");
        //map.put("data",connectOnlines);
        map.put("msg","success");
        return map;
    }

    /**
     * 分享录音取消
     */
    @Log(title = "分享录音取消", businessType = BusinessType.INSERT)
    @PostMapping("/delete")
    @ResponseBody
    public Map<String,Object> delete(String token, String recordId)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }



    /**
     * 新增保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/addSound")
    @ApiOperation("新增诊断")
    @ResponseBody
    public Map<String,Object> addSound(SoundPatientBaseinfo soundPatientBaseinfo,List<SoundPatientBody> list)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        for (SoundPatientBody soundpatientBody:list) {
            soundPatientBodyService.insertSoundPatientBody(soundpatientBody);
        }

        soundPatientBaseinfo.setPatientId(UUID.randomUUID().toString());
        soundPatientBaseinfoService.insertSoundPatientBaseinfo(soundPatientBaseinfo);
        map.put("code","200");
        map.put("data",new Date());
        map.put("msg","操作成功");
        return map;
    }


    @ApiOperation("新增诊断结果")
    @PostMapping("/addSoundDetail")
    @ResponseBody
    public Map<String,String> addSoundDetail(SoundPatientDetail detail)
    {
        SoundDetailVo detailVo = new SoundDetailVo();
        Long id = detail.getId();
        if (id > 0){
            soundPatientDetailService.updateSoundPatientDetail(detail);
        }else{
            soundPatientDetailService.insertSoundPatientDetail(detail);
        }

        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }


    /**
     * 查询【请填写功能名称】列表
     */
    @ApiOperation("结果列表")
    @PostMapping("/detailList")
    @ResponseBody
    public Map<String,Object> detailList(SoundPatientDetail soundPatientDetail)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","200");
        map.put("msg","操作成功");
        List<SoundPatientDetail> soundPatientDetails = soundPatientDetailService.selectSoundPatientDetailList(soundPatientDetail);

        map.put("data",soundPatientDetails);
        return map;
    }


    @PostMapping("/addBodyParts")
    @ResponseBody
    public Map<String,Object> addBodyParts(BodyParts bodyParts)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        bodyPartsService.insertBodyParts(bodyParts);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }


    @PostMapping( "/removeBodyParts")
    @ResponseBody
    public Map<String,Object> removeBodyParts(long id)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        bodyPartsService.deleteBodyPartsById(id);
        map.put("code","200");
        map.put("msg","操作成功");
        return map;
    }



    /**
     * 查询【请填写功能名称】列表
     */
    @ApiOperation("诊断结果")
    @PostMapping("/detail")
    @ResponseBody
    public Map<String,Object> detail(String recordId)
    {
        //创建返回
        Map<String,Object> map = new HashMap<String,Object>();
        SoundDetailVo detailVo = new SoundDetailVo();

        map.put("code","200");
        map.put("msg","操作成功");
        map.put("data",detailVo);
        return map;
    }

    @PostMapping("/listParts")
    @ApiOperation("身体部位列表")
    @ResponseBody
    public Map<String,Object> listParts(BodyParts bodyParts)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","操作成功");
        List<BodyParts> list = bodyPartsService.selectBodyPartsList(bodyParts);
        List<BodyParts> result = new ArrayList<BodyParts>();
        for (BodyParts bodyPart:list) {
            if (bodyPart.getId() >15L){
                bodyPart.setAllowDel(1);
            }else{
                bodyPart.setAllowDel(0);
            }
            result.add(bodyPart);
        }
        map.put("data",result);
        return map;
    }

    @PostMapping("/listFileLog")
    @ApiOperation("查询文件记录")
    @ResponseBody
    public Map<String,Object> listFileLog(Long accountId,String startTime,String endTime)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        List<FileLog> fileLogs = fileLogService.selectSoundPatientBodyById( startTime, endTime);
        map.put("code","200");
        map.put("systemTime",new Date());
        map.put("msg","操作成功");
        map.put("data",fileLogs);
        return map;
    }

    @PostMapping("/listSoundSelect")
    @ApiOperation("查询文件记录")
    @ResponseBody
    public Map<String,Object> listSoundSelect(Integer type)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        List<SoundSelect> soundSelects = selectService.selectSoundPatientBodyById(type);
        map.put("code","200");
        map.put("msg","操作成功");
        map.put("data",soundSelects);
        return map;
    }

    @PostMapping("/uploadFile")
    @ApiOperation("文件上传" +
            "")
    @ResponseBody
    public Map<String,Object> uploadFile(MultipartFile file,String localUrl,String fileType,String fileName)
    {
        //创建返回
        Map<String,Object> map = new HashMap<>();
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String bucketName = "yytech";
            String bucketNetName = "yytech.oss-cn-shanghai.aliyuncs.com";
            File toFile = null;
            if(file.equals("")||file.getSize()<=0){
                file = null;
            }else {
                InputStream ins = null;
                ins = file.getInputStream();
                toFile = new File(file.getOriginalFilename());
                inputStreamToFile(ins, toFile);
                ins.close();
            }

            String endpoint = Constants.endpoint;
            String accessKeyId = Constants.accessKeyId;
            String accessKeySecret = Constants.accessKeySecret;
            //OSSClient ossClient = new OSSClient(endpoint,accessKeyId,accessKeySecret);
            OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
            String objectName = sdf.format(new Date()) + "/" + toFile.getName();
            ossClient.putObject(bucketName, objectName, toFile);
            // 设置URL过期时间为1小时。
            Date expiration = new Date(System.currentTimeMillis() + 3600 * 1000);
            // 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
            URL url = ossClient.generatePresignedUrl(bucketName, objectName, expiration);
            ossClient.shutdown();
            System.out.println(url.toString());
            SoundPatientBody soundPatientBody = new SoundPatientBody();

            //soundPatientBodyService.insertSoundPatientBody(soundPatientBody);
            fileLogService.insertFileLog(localUrl,url.toString(),fileType,fileName,"","",2L,"",0);

            map.put("code","200");
            map.put("msg","操作成功");
            map.put("data",url.toString());
        }catch(Exception e){
            map.put("code","500");
            map.put("msg","系统错误");
        }

        return map;
    }


    public static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String createToken(
            String appId, String appKey, String channelId, String userId,
            String nonce, Long timestamp
    ) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(appId.getBytes());
        digest.update(appKey.getBytes());
        digest.update(channelId.getBytes());
        digest.update(userId.getBytes());
        digest.update(nonce.getBytes());
        digest.update(Long.toString(timestamp).getBytes());

        String token = DatatypeConverter.printHexBinary(digest.digest()).toLowerCase();
        return token;
    }




    public static String createUserID(String channelID, String user) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(channelID.getBytes());
        digest.update("/".getBytes());
        digest.update(user.getBytes());

        String uid = DatatypeConverter.printHexBinary(digest.digest()).toLowerCase();
        return uid.substring(0, 16);
    }



}
