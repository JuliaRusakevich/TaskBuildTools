package ru.clevertec.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.Copy;

import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

import java.util.*;

public class CustomPlugin implements Plugin<Project> {

    private static final String BUILD_REPORTS_JACOCO_TEST_HTML_INDEX_HTML = "/build/reports/jacoco/test/html/index.html";
    private static final String OUTPUT_PDF_REPORT = "output.pdf";

    @Override
    public void apply(Project project) {

        project.getTasks().register("pdfReport", Copy.class, task -> {

                            // Путь к входному PDF-файлу
                            String pathToFileHTML = project.getProjectDir().getAbsolutePath() + BUILD_REPORTS_JACOCO_TEST_HTML_INDEX_HTML;

                            List<String> lines = new ArrayList<>();
                            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFileHTML))) {
                                String line = bufferedReader.readLine();
                                while (line != null) {
                                    lines.add(line);
                                    line = bufferedReader.readLine();
                                }
                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                            }


                            for (String line : lines) {


                                try {
                                    ITextRenderer renderer = new ITextRenderer();
                                    renderer.setDocumentFromString(line);
                                    // Отображает документ в формате PDF
                                    renderer.layout();
                                    FileOutputStream fos = new FileOutputStream(OUTPUT_PDF_REPORT);
                                    renderer.createPDF(fos);
                                    fos.close();

                                    System.out.println("PDF report was created successfully");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                )
                .get().dependsOn("jacocoTestReport");
        project.getPlugins().apply("jacoco");
    }


}

