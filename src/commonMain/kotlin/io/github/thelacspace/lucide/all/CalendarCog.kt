package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15.228f, 16.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.228f, 19.148f)
                lineToRelative(-.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.47f, 14.305f)
                lineToRelative(.382f, .923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 20.772f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.148f, 15.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.53f, 21.696f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 16.852f)
                lineToRelative(.924f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 19.148f)
                lineToRelative(.924f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10.592f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.CalendarCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarCog: ImageVector
    @Composable get() = CalendarCogDefinition.asImageVector()
