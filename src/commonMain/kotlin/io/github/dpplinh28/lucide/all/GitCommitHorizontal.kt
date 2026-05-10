package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitCommitHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                lineTo(9f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                lineTo(21f, 12f)
            }
}

public val LucideIcons.All.GitCommitHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitCommitHorizontal: ImageVector
    @Composable get() = GitCommitHorizontalDefinition.asImageVector()
