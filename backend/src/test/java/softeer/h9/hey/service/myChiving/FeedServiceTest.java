package softeer.h9.hey.service.myChiving;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import softeer.h9.hey.domain.archiving.Feed;
import softeer.h9.hey.dto.myChiving.request.BookmarkRequest;
import softeer.h9.hey.dto.myChiving.response.BookmarkResponse;
import softeer.h9.hey.repository.myChiving.FeedRepository;

@DisplayName("Feed Service 테스트")
class FeedServiceTest {
	FeedRepository feedRepository = Mockito.mock(FeedRepository.class);
	FeedService feedService = new FeedService(feedRepository);

	@DisplayName("북마크 여부를 확인한다.")
	@Test
	void hasBookmark() {
		int userId = 1;
		long feedId = 1234567890L;
		BookmarkRequest request = new BookmarkRequest(feedId);
		Feed response = new Feed();
		response.setFeedId(feedId);
		response.setUserId(userId);
		response.setIsMarked(true);
		when(feedRepository.hasBookmark(userId, feedId))
			.thenReturn(response);

		BookmarkResponse result = feedService.hasBookmark(userId, request);

		assertTrue(result.isMarked());
	}
}
