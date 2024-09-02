-- Insert articles
insert into Article (id, title, content, author, published_timestamp, is_deleted) values
(1, 'First Article', 'Content of the first article', 'John Doe', '2024-09-01 10:00:00', false),
(2, 'Second Article', 'Content of the second article', 'Jane Smith', '2024-09-02 11:00:00', false),
(3, 'Third Article', 'Content of the third article', 'Alice Johnson', '2024-09-03 12:00:00', false);

-- Insert comments for the first article
INSERT INTO Comment (id, content, author, published_timestamp, is_deleted, article_id) VALUES
(1, 'Great article!', 'Commenter1', '2024-09-01 10:15:00', false, 1),
(2, 'I found this very helpful.', 'Commenter2', '2024-09-01 10:20:00', false, 1),
(3, 'Well written!', 'Commenter3', '2024-09-01 10:25:00', false, 1),
(4, 'Thanks for sharing.', 'Commenter4', '2024-09-01 10:30:00', false, 1),
(5, 'Looking forward to more content.', 'Commenter5', '2024-09-01 10:35:00', false, 1);

-- Insert comments for the second article
insert into Comment(id, content, author, published_timestamp, is_deleted, article_id) VALUES
(6, 'Interesting perspective.', 'Commenter6', '2024-09-02 11:15:00', false, 2),
(7, 'I learned something new today.', 'Commenter7', '2024-09-02 11:20:00', false, 2),
(8, 'Can you elaborate on this topic?', 'Commenter8', '2024-09-02 11:25:00', false, 2),
(9, 'Thanks for the insights.', 'Commenter9', '2024-09-02 11:30:00', false, 2),
(10, 'Great writing!', 'Commenter10', '2024-09-02 11:35:00', false, 2);

-- Insert comments for the third article
insert into Comment (id, content, author, published_timestamp, is_deleted, article_id) VALUES
(11, 'This was a fascinating read.', 'Commenter11', '2024-09-03 12:15:00', false, 3),
(12, 'I completely agree with this.', 'Commenter12', '2024-09-03 12:20:00', false, 3),
(13, 'Could you provide more examples?', 'Commenter13', '2024-09-03 12:25:00', false, 3),
(14, 'Very informative, thanks.', 'Commenter14', '2024-09-03 12:30:00', false, 3),
(15, 'I enjoyed reading this.', 'Commenter15', '2024-09-03 12:35:00', false, 3);
