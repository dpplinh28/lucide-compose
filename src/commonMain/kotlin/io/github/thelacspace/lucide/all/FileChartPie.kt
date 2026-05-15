package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileChartPie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.941f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.704f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3.512f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.017f, 11.512f)
                arcToRelative(6f, 6f, 0f, true, false, 8.466f, 8.475f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -.552f, .45f, -1.008f, .995f, -.917f)
                arcToRelative(6f, 6f, 0f, false, true, 4.922f, 4.922f)
                curveToRelative(.091f, .544f, -.365f, .995f, -.917f, .995f)
                close()
            }
}

public val LucideIcons.All.FileChartPieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileChartPie: ImageVector
    @Composable get() = FileChartPieDefinition.asImageVector()
