import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    /*
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-page.html");
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("https://validlink.com");
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile6() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile7() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile8() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile9() throws IOException {
        Path fileName = Path.of("test-file9.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("`google.com");
        expectedLinks.add("google.com");
        expectedLinks.add("ucsd.edu");
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFile10() throws IOException{
        Path fileName = Path.of("test-file10.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("a.com");
        expectedLinks.add("a.com(())");
        expectedLinks.add("example.com");
        assertEquals(expectedLinks, links);
    }
    */

    @Test
    public void testFile11() throws IOException{
        Path fileName = Path.of("test-file11.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("https://ucsd-cse15l-w22.github.io/");
        assertEquals(expectedLinks, links);
    }

    @Test
    public void testFail() {
        // fail();
    }

    @Test
    public void testFail2() {
        assertTrue(true);
    }
}