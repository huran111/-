package com.hr.common.exception.file;

import org.apache.tomcat.util.http.fileupload.FileUploadException;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 10:24 2018/7/3
 * @Modified By:
 */
public class FileNameLengthLimitExceededException extends FileUploadException {
    private static final long serialVersionUID = 1L;
    private int length;
    private int maxLength;
    private String filename;

    public FileNameLengthLimitExceededException(String filename, int length, int maxLength) {
        super("file name : [" + filename + "], length : [" + length + "], max length : [" + maxLength + "]");
        this.length = length;
        this.maxLength = maxLength;
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public int getLength() {
        return length;
    }

    public int getMaxLength() {
        return maxLength;
    }

}
