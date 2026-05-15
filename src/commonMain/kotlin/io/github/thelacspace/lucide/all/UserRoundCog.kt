package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.305f, 19.53f)
                lineToRelative(.923f, -.382f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.228f, 16.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 15.228f)
                lineToRelative(-.383f, -.923f)
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
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 10.434f, -7.62f)
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
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.UserRoundCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundCog: ImageVector
    @Composable get() = UserRoundCogDefinition.asImageVector()
