package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.852f, 14.772f)
                lineToRelative(-.383f, .923f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f, 14.772f)
                arcToRelative(3f, 3f, 0f, true, false, -2.296f, -5.544f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.148f, 9.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.53f, 15.696f)
                lineToRelative(-.382f, -.924f)
                arcToRelative(3f, 3f, 0f, true, true, -2.296f, -5.544f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.772f, 10.852f)
                lineToRelative(.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.772f, 13.148f)
                lineToRelative(.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 10f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 14f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.228f, 10.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.228f, 13.148f)
                lineToRelative(-.923f, .383f)
            }
}

public val LucideIcons.All.ServerCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerCog: ImageVector
    @Composable get() = ServerCogDefinition.asImageVector()
