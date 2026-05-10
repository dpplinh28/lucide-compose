package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeySquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.4f, 2.7f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.4f, 0f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 3.4f)
                lineToRelative(-3.7f, 3.7f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.4f, 0f)
                lineTo(8.7f, 9.8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -3.4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 7f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.4f, 10.6f)
                lineToRelative(-6.814f, 6.814f)
                arcTo(2f, 2f, 0f, false, false, 2f, 18.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(.172f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -.586f)
                lineToRelative(.814f, -.814f)
            }
}

public val LucideIcons.All.KeySquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeySquare: ImageVector
    @Composable get() = KeySquareDefinition.asImageVector()
