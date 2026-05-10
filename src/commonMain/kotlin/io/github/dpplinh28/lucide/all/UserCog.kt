package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                horizontalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.305f, 16.53f)
                lineToRelative(.923f, -.382f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.228f, 13.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 12.228f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 17.772f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.148f, 12.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.53f, 18.696f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 13.852f)
                lineToRelative(.924f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 16.148f)
                lineToRelative(.924f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
}

public val LucideIcons.All.UserCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserCog: ImageVector
    @Composable get() = UserCogDefinition.asImageVector()
