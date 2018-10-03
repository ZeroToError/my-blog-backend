package personal.nvhung.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.nvhung.src.entities.Post;


public interface PostRepository extends JpaRepository<Post, Long> {
}
