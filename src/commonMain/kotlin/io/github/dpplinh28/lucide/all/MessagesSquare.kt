package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessagesSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, .586f)
                lineToRelative(-2.202f, 2.202f)
                arcTo(.71f, .71f, 0f, false, true, 2f, 14.286f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10.286f)
                arcToRelative(.71f, .71f, 0f, false, true, -1.212f, .502f)
                lineToRelative(-2.202f, -2.202f)
                arcTo(2f, 2f, 0f, false, false, 17.172f, 19f)
                horizontalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
            }
}

public val LucideIcons.All.MessagesSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessagesSquare: ImageVector
    @Composable get() = MessagesSquareDefinition.asImageVector()
