package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(9f, 12f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 7f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.VoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vote: ImageVector
    @Composable get() = VoteDefinition.asImageVector()
