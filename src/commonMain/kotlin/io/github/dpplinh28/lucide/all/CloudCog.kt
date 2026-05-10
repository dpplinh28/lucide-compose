package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.852f, 19.772f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.148f, 14.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f, 19.772f)
                arcToRelative(3f, 3f, 0f, true, false, -2.296f, -5.544f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.53f, 20.696f)
                lineToRelative(-.382f, -.924f)
                arcToRelative(3f, 3f, 0f, true, true, -2.296f, -5.544f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.772f, 15.852f)
                lineToRelative(.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.772f, 18.148f)
                lineToRelative(.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.2f, 15.1f)
                arcToRelative(7f, 7f, 0f, true, true, 9.93f, -9.858f)
                arcTo(7f, 7f, 0f, false, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.5f, 8.2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.228f, 15.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.228f, 18.148f)
                lineToRelative(-.923f, .383f)
            }
}

public val LucideIcons.All.CloudCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudCog: ImageVector
    @Composable get() = CloudCogDefinition.asImageVector()
