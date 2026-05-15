package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestCreate") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 6f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 18f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.GitPullRequestCreateDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestCreate: ImageVector
    @Composable get() = GitPullRequestCreateDefinition.asImageVector()
