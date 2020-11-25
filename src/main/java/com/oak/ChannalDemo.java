package com.oak;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannalDemo {
    public static void main(String[] args) {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel = FileChannel.open(Paths.get("D:/虚拟机镜像/CentOS-7-x86_64-Minimal-1804.iso"), StandardOpenOption.READ);
            outChannel = FileChannel.open(Paths.get("D:/虚拟机镜像/2.iso"), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

            MappedByteBuffer inBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
            MappedByteBuffer outBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

            byte[] bytes = new byte[inBuffer.limit()];

            inBuffer.get(bytes);

            outBuffer.put(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inChannel != null) {
                try {
                    inChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outChannel != null) {
                try {
                    outChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
