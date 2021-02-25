/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kctech.assesment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.omg.CORBA.Any;

/**
 *
 * @author Harfan
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        Any file path. final Path path = Paths.get(...); //Any file path Syntax is wrong placed
        Files.lines(path).forEach(System.out::println);
    }
}
