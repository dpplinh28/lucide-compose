package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToolCase") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.817f, 10.995f)
                lineToRelative(-.971f, -1.45f)
                lineToRelative(1.034f, -1.232f)
                arcToRelative(2f, 2f, 0f, false, false, -2.025f, -3.238f)
                lineToRelative(-1.82f, .364f)
                lineTo(9.91f, 3.885f)
                arcToRelative(2f, 2f, 0f, false, false, -3.625f, .748f)
                lineTo(6.141f, 6.55f)
                lineToRelative(-1.725f, .426f)
                arcToRelative(2f, 2f, 0f, false, false, -.19f, 3.756f)
                lineToRelative(.657f, .27f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.822f, 10.995f)
                lineToRelative(2.26f, -5.38f)
                arcToRelative(1f, 1f, 0f, false, false, -.557f, -1.318f)
                lineTo(16.954f, 2.9f)
                arcToRelative(1f, 1f, 0f, false, false, -1.281f, .533f)
                lineToRelative(-.924f, 2.122f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12.006f)
                arcTo(1f, 1f, 0f, false, true, 4.994f, 11f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
}

public val LucideIcons.All.ToolCaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToolCase: ImageVector
    @Composable get() = ToolCaseDefinition.asImageVector()
