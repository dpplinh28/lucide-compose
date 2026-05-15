package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.305f, 7.53f)
                lineToRelative(.923f, -.382f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.228f, 4.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 3.228f)
                lineToRelative(-.383f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 8.772f)
                lineToRelative(-.383f, .923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.148f, 3.228f)
                lineToRelative(.383f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.53f, 9.696f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 4.852f)
                lineToRelative(.924f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 7.148f)
                lineToRelative(.924f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 13f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.MonitorCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorCog: ImageVector
    @Composable get() = MonitorCogDefinition.asImageVector()
