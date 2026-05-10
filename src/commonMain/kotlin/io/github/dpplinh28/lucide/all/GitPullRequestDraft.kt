package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestDraft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                lineTo(6f, 21f)
            }
}

public val LucideIcons.All.GitPullRequestDraftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestDraft: ImageVector
    @Composable get() = GitPullRequestDraftDefinition.asImageVector()
