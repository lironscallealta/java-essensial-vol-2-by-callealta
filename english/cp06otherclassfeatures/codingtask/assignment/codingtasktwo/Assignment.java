package english.cp06otherclassfeatures.codingtask.assignment.codingtasktwo;

public class Assignment {
    /*
     * # Coding Task 2: Implementing an Abstract Class and Interfaces
     *
     * ## Objective and description
     *
     * Practice Java's `abstract` keyword and interfaces by designing and implementing a small content management system (CMS) for articles, videos, and podcasts. Each content type has its own attributes and behaviors.
     *
     * ## 1. Abstract class: Content
     *
     * Create an abstract class `Content` with:
     *
     * - Attributes `title: String` and `author: String`.
     * - A constructor that initializes title and author.
     * - Abstract method `void displayInfo()`, implemented by subclasses to display content information.
     * - Abstract method `Double calculateReadingTime()`, implemented by subclasses to estimate the time needed to consume the content.
     * - Concrete method `void publish()`, which prints a message indicating that the content is published.
     *
     * ## 2. Interfaces
     *
     * - `Readable`: declare `void read()` for content that can be read.
     * - `Watchable`: declare `void watch()` for content that can be watched.
     *
     * ## 3. Content subclasses
     *
     * ### Article
     *
     * - Extend `Content` and implement `Readable`.
     * - Add `wordCount: int`.
     * - Implement `displayInfo()` to display title, author, and word count.
     * - Implement `calculateReadingTime()` using an average speed of 200 words per minute.
     * - Implement `read()` to print a message indicating that the article is being read.
     *
     * ### Video
     *
     * - Extend `Content` and implement `Watchable`.
     * - Add `duration: double`, in minutes.
     * - Implement `displayInfo()` to display title, author, and duration.
     * - Implement `calculateReadingTime()` to return the duration.
     * - Implement `watch()` to print a message indicating that the video is being watched.
     *
     * ### Podcast
     *
     * - Extend `Content` and implement both `Readable` and `Watchable`.
     * - Add `duration: double` and `transcript: boolean`, indicating whether a transcript is available.
     * - Implement `displayInfo()` to display title, author, duration, and transcript availability.
     * - Implement `calculateReadingTime()` based either on duration when watched or on a word count when a transcript is available. Assume a fixed word count for the transcript.
     * - Implement both `read()` and `watch()` based on whether the podcast has a transcript.
     *
     * ## 4. Main method
     *
     * - Create instances of `Article`, `Video`, and `Podcast`.
     * - Display their information using `displayInfo()`.
     * - Demonstrate `read()` or `watch()` as appropriate.
     * - Publish each content type.
     *
     * ## Sample output from the source
     *
     * ```text
     * Article: "Learn Java The Right Way", by Dr. Lawrence Decamora
     * Word Count: 1200
     * Estimated Reading Time: 6.0 minutes
     * Reading Article: "Learn Java The Right Way"
     * Publishing content: Learn Java The Right Way
     * Video: "Java Tutorial", by Michelle Decamora
     * Duration: 30.0 minutes
     * Estimated Watching Time: 30.0 minutes
     * Watching Video: "Java Tutorial"
     * Publishing content: Java Tutorial
     * Podcast: "Java Basics", by John Doe
     * Duration: 20.0 minutes
     * Transcript Available: true
     * Estimated Reading Time: 5.0 minutes
     * Reading Podcast: "Java Basics"
     * Watching Podcast: "Java Basics"
     * Publishing content: Java Basics
     * ```
     *
     * **Source details:** `Double` is the return type printed in the abstract-method requirement; duration attributes use `double`. The source does not specify the fixed transcript word count or the exact behavior of both podcast methods when no transcript is available. Those details are left as stated, without adding a solution.
     */
}
