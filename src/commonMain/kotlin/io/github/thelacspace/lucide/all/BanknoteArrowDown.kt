package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BanknoteArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 19f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.BanknoteArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BanknoteArrowDown: ImageVector
    @Composable get() = BanknoteArrowDownDefinition.asImageVector()
