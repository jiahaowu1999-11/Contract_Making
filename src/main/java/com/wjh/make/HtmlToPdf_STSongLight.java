package com.wjh.make;

import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.CJKFontResolver;
import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class HtmlToPdf_STSongLight {

    public static void main(String[] args) throws Exception {
        htmlStringToPdf();
    }

    /**
     * htmlStringToPdf:(html字符串转换成pdf). <br/>
     *
     * @throws Exception
     * @author xymy
     * @date 2018年11月8日下午2:59:07
     */
    private static void htmlStringToPdf() throws Exception {
        CJKFontResolver cjkFontResolver = new CJKFontResolver();
        ITextRenderer renderer = new ITextRenderer(cjkFontResolver);

        String outFile = "D:/STSongLi.pdf";
        File file = new File(outFile);
        if (file.exists()) {
            boolean f = file.delete();
        }
        OutputStream os = new FileOutputStream(outFile);
        String htmlstr = "<body style=\"font-family: STSong-Light-H\">" + " <p>    </p><div><div style=\"font-family: C39HrP60DhTt;font-size: 60px;POSITION: absolute; LEFT: 500px;  TOP: 80px;display:none;\"></div><div>\n" +
                "   <div class=\"box_border\" style=\"border: thin solid rgb(0, 0, 0);\">\n" +
                "   <div class=\"title\" style=\"width: 95%; margin-bottom: 20px;\"><p style=\"width: 100%; text-align: center; font-size: 16px; color: rgb(0, 0, 0);\">\n" +
                "   \n" +
                "   \n" +
                "               \n" +
                "                   \n" +
                "                   不予行政许可通知书(客户联)                  \n" +
                "               \n" +
                "           </p></div><div class=\"top\" style=\"border-bottom: 1px dashed rgb(51, 51, 51); min-height: 150px; padding-bottom: 3px;\"><p>负责部门名称：测试单位-审批局            \n" +
                "</p><p>办件流水号：2018124442</p>\n" +
                "\n" +
                "               <p>\n" +
                "                   \n" +
                "               </p>\n" +
                "           \n" +
                "           \n" +
                "               <p>\n" +
                "               项目名称：测试项目zwd003             </p>\n" +
                "           \n" +
                "           \n" +
                "           <p>\n" +
                "               \n" +
                "                   \n" +
                "                   \n" +
                "                   \n" +
                "                       企业名称：\n" +
                "                   \n" +
                "                   \n" +
                "                   世界500强          \n" +
                "</p><p>\n" +
                "   \n" +
                "       \n" +
                "                   \n" +
                "                   \n" +
                "                       企业地址：\n" +
                "                   \n" +
                "                   \n" +
                "                   广州          \n" +
                "</p><p>客户联系方式：13751327669<span class=\"span_2\" style=\"margin-left: 120px;\">客户联系人：测试</span></p><p>\n" +
                "               代理人：</p></div><div class=\"content\" style=\"margin-top: 15px; border-bottom: 1px dashed rgb(51, 51, 51); padding-bottom: 2px; min-height: 350px;\"><p>审批事项名称：新企业事项-ylp</p><p>\n" +
                "   <strong>本部门已于\n" +
                "                   2018-01-15 14:34:16\n" +
                "                       将此件办理完毕。                </strong>\n" +
                "           </p><p>\n" +
                "   批准结果：\n" +
                "               \n" +
                "                   \n" +
                "                   不批准             \n" +
                "           \n" +
                "</p><p>\n" +
                "   \n" +
                "       \n" +
                "   </p>\n" +
                "\n" +
                "               \n" +
                "               \n" +
                "                   <p class=\"content_p3\">\n" +
                "                       不批准理由：                  </p>\n" +
                "               <p class=\"content_p4\">\n" +
                "                   可以办理                </p>\n" +
                "               \n" +
                "           \n" +
                "\n" +
                "   <p class=\"content_p6\">\n" +
                "       <strong>(若对本决定不服，可以直接到本决定之日起60日内，依法申请行政复议，也可以在三个月内依法向人民法院提出行政诉讼。)</strong>\n" +
                "   </p>\n" +
                "\n" +
                "       </div><div class=\"footer\" style=\"margin-top: 15px; width: 100%; padding-bottom: 25px; bottom: 0px;\">        <p>部门窗口负责人：审批局单位管理员<span class=\"footer_span4\" style=\"margin-left: 182px;\">经办日期：2018-01-15 14:25:51</span></p><p>经办人：窗口测试001<span class=\"footer_span3\" style=\"margin-left: 150px; display: inline-block;\">监督电话：020-66666666</span></p><p>部门窗口联系电话：020-22222222</p><p style=\"margin-left:410px;margin-top:40px\">（部门行政审批专用章盖印）</p><p>打印人：窗口测试001<span class=\"footer_span3\" style=\"margin-left: 150px; display: inline-block;\">打印日期：</span>2018-01-15 14:34:21</p></div> \n" +
                "   </div></div></div><div style=\"page-break-before:always\"><br/></div><div><div style=\"font-family: C39HrP60DhTt;font-size: 60px;POSITION: absolute; LEFT: 500px;margin-top:50px;z-index:-1;display:none;\"></div><div>\n" +
                "   <div class=\"box_border\" style=\"border: thin solid rgb(0, 0, 0);\">\n" +
                "   <div class=\"title\" style=\"width: 95%; margin-bottom: 20px;\"><p style=\"width: 100%; text-align: center; font-size: 16px; color: rgb(0, 0, 0);\">\n" +
                "   \n" +
                "   \n" +
                "               \n" +
                "                   \n" +
                "                   不予行政许可通知书(存根联)                  \n" +
                "               \n" +
                "           </p></div><div class=\"top\" style=\"border-bottom: 1px dashed rgb(51, 51, 51); min-height: 150px; padding-bottom: 3px;\"><p>负责部门名称：测试单位-审批局            \n" +
                "</p><p>办件流水号：2018124442</p>\n" +
                "\n" +
                "               <p>\n" +
                "                   \n" +
                "               </p>\n" +
                "           \n" +
                "           \n" +
                "               <p>\n" +
                "               项目名称：测试项目zwd003             </p>\n" +
                "           \n" +
                "           \n" +
                "           <p>\n" +
                "               \n" +
                "                   \n" +
                "                   \n" +
                "                   \n" +
                "                       企业名称：\n" +
                "                   \n" +
                "                   \n" +
                "                   世界500强          \n" +
                "</p><p>\n" +
                "   \n" +
                "       \n" +
                "                   \n" +
                "                   \n" +
                "                       企业地址：\n" +
                "                   \n" +
                "                   \n" +
                "                   广州          \n" +
                "</p><p>客户联系方式：13751327669<span class=\"span_2\" style=\"margin-left: 120px;\">客户联系人：测试</span> </p><p>\n" +
                "               代理人：</p></div><div class=\"content\" style=\"margin-top: 15px; border-bottom: 1px dashed rgb(51, 51, 51); padding-bottom: 2px; min-height: 350px;\"><p>审批事项名称：新企业事项-ylp</p><p>\n" +
                "   <strong>本部门已于\n" +
                "                   2018-01-15 14:34:16\n" +
                "                       将此件办理完毕。                </strong>\n" +
                "           </p><p>\n" +
                "   批准结果：\n" +
                "               \n" +
                "                   \n" +
                "                   不批准             \n" +
                "           \n" +
                "</p><p>\n" +
                "   \n" +
                "       \n" +
                "   </p>\n" +
                "\n" +
                "               \n" +
                "               \n" +
                "                   <p class=\"content_p3\">\n" +
                "                       不批准理由：                  </p>\n" +
                "               <p class=\"content_p4\">\n" +
                "                   可以办理                </p>\n" +
                "               \n" +
                "           \n" +
                "\n" +
                "   <p class=\"content_p6\">\n" +
                "       <strong>(若对本决定不服，可以直接到本决定之日起60日内，依法申请行政复议，也可以在三个月内依法向人民法院提出行政诉讼。)</strong>\n" +
                "   </p>\n" +
                "\n" +
                "       </div><div class=\"footer\" style=\"margin-top: 15px; width: 100%; padding-bottom: 25px; bottom: 0px;\">        <p>部门窗口负责人：审批局单位管理员<span class=\"footer_span4\" style=\"margin-left: 182px;\">经办日期：2018-01-15 14:25:51</span></p><p>经办人：窗口测试001<span class=\"footer_span3\" style=\"margin-left: 150px; display: inline-block;\">监督电话：020-66666666</span></p><p>部门窗口联系电话：020-22222222</p><p style=\"margin-left:410px;margin-top:40px\">（客户签署姓名及日期）</p><p>打印人：窗口测试001<span class=\"footer_span3\" style=\"margin-left: 150px; display: inline-block;\">打印日期：</span>2018-01-15 14:34:21</p></div> \n" +
                "   </div></div></div><p>\n" +
                "\n" +
                "   </p>" + "</body>";
//        renderer.getSharedContext().setFontResolver(cjkFontResolver);
        renderer.setDocumentFromString(htmlstr);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
    }

    /**
     * htmlFileToPDF:(html文件转换成pdf). <br/>
     *
     * @throws Exception
     * @author xymy
     * @date 2018年11月8日下午2:59:42
     */
    private static void htmlFileToPDF() throws Exception {
        String inputFile = "C:/Users/xymy/Desktop/test.html";
        String outFile = "D:\\test1.pdf";
        OutputStream os = new FileOutputStream(outFile);
        ITextRenderer renderer = new ITextRenderer();
        ITextFontResolver fontResolver = renderer.getFontResolver();
        fontResolver.addFont("C:/Windows/fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        String url = new File(inputFile).toURI().toURL().toString();
        renderer.setDocumentFromString(url);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
    }

}

