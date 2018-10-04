package personal.nvhung.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.nvhung.src.entities.Post;

import java.util.Optional;


public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findByTitleUrl(String titleUrl);
}
