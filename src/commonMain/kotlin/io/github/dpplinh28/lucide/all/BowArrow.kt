package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BowArrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.575f, 11.082f)
                arcToRelative(13f, 13f, 0f, false, true, 1.048f, 9.027f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, -1.914f, .597f)
                lineTo(14f, 17f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                lineTo(3.29f, 6.29f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, .6f, -1.91f)
                arcToRelative(13f, 13f, 0f, false, true, 9.03f, 1.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -1.207f, .5f)
                lineToRelative(-2.646f, 2.646f)
                arcTo(.5f, .5f, 0f, false, false, 3.5f, 18f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .854f, .354f)
                lineTo(9.5f, 18.207f)
                arcTo(1.7f, 1.7f, 0f, false, false, 10f, 17f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.707f, 14.293f)
                lineTo(21f, 3f)
            }
}

public val LucideIcons.All.BowArrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BowArrow: ImageVector
    @Composable get() = BowArrowDefinition.asImageVector()
