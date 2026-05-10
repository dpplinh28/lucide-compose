package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestCreateArrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 9f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 18f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.GitPullRequestCreateArrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestCreateArrow: ImageVector
    @Composable get() = GitPullRequestCreateArrowDefinition.asImageVector()
